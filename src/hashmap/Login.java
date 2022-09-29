package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    HashMap<String, UserData> userList = initUsers();

    while (true) {

      viewUsers(userList);

      System.out.println("Introduzca su nombre de usuario:");
      String userName = input.nextLine();

      if (userList.containsKey(userName)) {
        //Miramos si esta ya logado en le sistema
        if (userList.get(userName).isLogged()) {
          System.out.println("El usuario " + userName + " ya esta en el sistema.");
          System.out.println("¿Desea cerrar su sesión? si/no");
          if (input.nextLine().equals("si")) {
            userList.get(userName).setLogged(false);
            System.out.println("Se ha cerrado la sesión de " + userName);
          }
        } else {
          //Miramos si esta bloqueado
          if (userList.get(userName).getTries() < 3) {
            //Intentamos hacer login
            UserData loggedUser = logUser(userName, userList.get(userName));
            userList.replace(userName, loggedUser);
            //Mostramos mensaje según si de hizo login o no
            if (userList.get(userName).isLogged()) {
              System.out.println("Ha accedido al área restringida");
            } else {
              System.err.println("La contraseña introducida no es correcta.");
            }
          } else {
            System.err.println("Lo siento, no tiene acceso al área restringida");
          }

        }
      } else {
        System.out.println("El nombre de usuario " + userName + " no esta registrado.");
        System.out.println("Desea crear un usuario nuevo si/no:");
        if (input.nextLine().equals("si")) {
          System.out.println("Introduzca la contraseña para el nuevo usuario " + userName + ":");
          userList.put(userName, new UserData(input.nextLine()));
        }
      }
    }

  }

  private static void viewUsers(HashMap<String, UserData> userList) {
    for (Map.Entry user : userList.entrySet()) {
      UserData data = (UserData) user.getValue();
      System.out.println(
          "Estado: " + (data.isLogged() ? "Logged In -> " : "Logged Out -> ") + user.getKey()
              + " -> Intentos : " + data.getTries());
    }
  }

  private static UserData logUser(String name, UserData userData) {
    Scanner input = new Scanner(System.in);

    UserData user = new UserData(userData.getPass(),
        userData.isLogged(),
        userData.getTries());
    System.out.println("Introduzca la contraseña del usuario " + name + ":");
    String pass = input.nextLine();
    if (user.getPass().equals(pass)) {
      user.setLogged(true);
      user.setTries(0);
    } else {
      user.setTries(user.getTries() + 1);
    }
    return user;
  }

  private static HashMap<String, UserData> initUsers() {
    HashMap<String, UserData> userLib = new HashMap<>();

    userLib.put("Adam", new UserData("aaaa"));
    userLib.put("Betty", new UserData("bbbb"));
    userLib.put("Cecil", new UserData("cccc"));

    return userLib;
  }
}
