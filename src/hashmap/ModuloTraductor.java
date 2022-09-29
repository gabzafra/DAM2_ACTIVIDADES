package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class ModuloTraductor {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    HashMap<String, String> menuText = getLocalText(askForLanguage());

    if (menuText.get("lang").length() > 0) {
      System.out.println(menuText.get("ask_name"));
      System.out.println(menuText.get("hail") + input.nextLine());
    } else {
      System.err.println("El programa no soporta el idioma elegido.");//No se llega a usar
    }

  }

  private static HashMap<String, String> getLocalText(String language) {
    HashMap<String, String> traduction = new HashMap<>();
    switch (language) {
      case "en" -> {
        traduction.put("lang", "en");
        traduction.put("ask_name", "Introduce your user name: ");
        traduction.put("hail", "Hello Mr. ");
      }
      case "es" -> {
        traduction.put("lang", "es");
        traduction.put("ask_name", "Introduce tu nombre de usuario: ");
        traduction.put("hail", "Hola Sr. ");
      }
      default -> traduction.put("lang", "");//No se llega a usar
    }
    return traduction;
  }

  private static String askForLanguage() {
    Scanner input = new Scanner(System.in);
    String language = "";
    while (!language.equals("es") && !language.equals("en")) {
      System.out.println("Choose language/Elija idioma (en/es):");
      language = input.nextLine();
    }
    return language;
  }

}
