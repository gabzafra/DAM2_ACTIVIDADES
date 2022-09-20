package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Diccionario {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    HashMap<String, HashMap<String, String>> idiomas = initIdiomas();

    String idiomaActual = "ES";

    while (true) {
      System.out.println(idiomaActual.equals("ES") ? "ESPAÑOL - INGLES" : "INGLES - ESPAÑOL");
      System.out.println(idiomas.get("ES"));
      System.out.println(idiomas.get("EN"));
      System.out.println("Elija una opción:");
      System.out.println("-----------------");
      System.out.println("1. Buscar palabra");
      System.out.println("2. Listar palabras por letra");
      System.out.println("3. Añadir palabra");
      System.out.println("4. Modificar definición");
      System.out.println("5. Eliminar palabra");
      System.out.println("6. Cambiar idioma");
      switch (input.nextInt()) {
        case 1 -> buscarPalabra(idiomas.get(idiomaActual));
        case 2 -> listarPorLetra(idiomas.get(idiomaActual));
        case 3 -> addPalabra(idiomaActual, idiomas);
        case 4 -> updatePalabra(idiomaActual, idiomas);
        case 5 -> deletePalabra(idiomaActual, idiomas);
        case 6 -> idiomaActual = idiomaActual.equals("ES") ? "EN" : "ES";
        default -> System.err.println("Debe elegir una opción de la lista.");
      }
    }
  }

  private static HashMap<String, HashMap<String, String>> initIdiomas() {
    HashMap<String, HashMap<String, String>> idiomas = new HashMap<>();

    idiomas.put("ES", new HashMap<>());

    idiomas.get("ES").put("brazo", "arm");
    idiomas.get("ES").put("pie", "foot");
    idiomas.get("ES").put("mano", "hand");
    idiomas.get("ES").put("pierna", "leg");
    idiomas.get("ES").put("cabeza", "head");
    idiomas.get("ES").put("torso", "torso");
    idiomas.get("ES").put("pez", "fish");
    idiomas.get("ES").put("gato", "cat");
    idiomas.get("ES").put("perro", "dog");
    idiomas.get("ES").put("estrella", "star");
    idiomas.get("ES").put("cinco", "five");
    idiomas.get("ES").put("tiempo", "time");
    idiomas.get("ES").put("polvo", "dust");
    idiomas.get("ES").put("negro", "black");
    idiomas.get("ES").put("lejos", "far");
    idiomas.get("ES").put("gloria", "glory");
    idiomas.get("ES").put("galleta", "cookie");
    idiomas.get("ES").put("zapato", "shoe");
    idiomas.get("ES").put("eliminar", "delete");
    idiomas.get("ES").put("cuerda", "rope");
    idiomas.get("ES").put("sonido", "sound");

    idiomas.put("EN", flipDiccionario(idiomas.get("ES")));

    return idiomas;
  }

  private static void deletePalabra(String idiomaActual,
      HashMap<String, HashMap<String, String>> idiomas) {
    Scanner input = new Scanner(System.in);

    HashMap<String, String> diccionarioActual = idiomas.get(idiomaActual);

    System.out.println("Escriba la palabra que desea eliminar: ");
    String palabra = input.nextLine();
    System.out.println("-----------------");

    if (diccionarioActual.containsKey(palabra)) {
      for (String key : idiomas.keySet()) {
        if (!key.equals(idiomaActual)) {
          idiomas.get(key).remove(diccionarioActual.get(palabra));
        }
      }
      diccionarioActual.remove(palabra);
    } else {
      System.err.println("La palabra " + palabra + " no esta en el diccionario.");
    }
    System.out.println("-----------------");
  }

  private static void updatePalabra(String idiomaActual,
      HashMap<String, HashMap<String, String>> idiomas) {
    Scanner input = new Scanner(System.in);

    System.out.println("Escriba la palabra que quiere modificar:");
    String palabra = input.nextLine();

    if (idiomas.get(idiomaActual).containsKey(palabra)) {
      System.out.println("Escriba la nueva traducción de la palabra " + palabra);
      String traduccion = input.nextLine();

      HashMap<String, String> diccionarioActual = idiomas.get(idiomaActual);

      for (String key : idiomas.keySet()) {
        if (!key.equals(idiomaActual)) {
          idiomas.get(key).remove(diccionarioActual.get(palabra));
          idiomas.get(key).put(traduccion, palabra);
        }
      }

      diccionarioActual.put(palabra, traduccion);

    } else {
      System.err.println("La palabra " + palabra + " no esta en el diccionario.");
    }
    System.out.println("-----------------");
  }

  private static void addPalabra(String idiomaActual,
      HashMap<String, HashMap<String, String>> idiomas) {
    Scanner input = new Scanner(System.in);

    System.out.println("Escriba la palabra que quiere añadir:");
    String palabra = input.nextLine();
    System.out.println("Escriba la traducción de la palabra " + palabra);
    String traduccion = input.nextLine();
    System.out.println("-----------------");

    for (String key : idiomas.keySet()) {
      if (!key.equals(idiomaActual)) {
        idiomas.get(key).put(traduccion, palabra);
      }
    }

    idiomas.get(idiomaActual).put(palabra, traduccion);
    System.out.println("-----------------");
  }

  private static void listarPorLetra(HashMap<String, String> diccionario) {
    Scanner input = new Scanner(System.in);

    System.out.println("Escriba la letra que desea mostrar:");
    String letra = input.nextLine();
    System.out.println("-----------------");

    for (String key : diccionario.keySet()) {
      if (key.startsWith(letra)) {
        System.out.println(key + " -> " + diccionario.get(key));
      }
    }
    System.out.println("-----------------");
  }

  private static HashMap<String, String> flipDiccionario(HashMap<String, String> diccionario) {
    HashMap<String, String> inverted = new HashMap<>();

    for (String key : diccionario.keySet()
    ) {
      inverted.put(diccionario.get(key), key);
    }
    return inverted;
  }

  private static void buscarPalabra(HashMap<String, String> dicionario) {
    Scanner input = new Scanner(System.in);

    System.out.println("Escriba la palabra que desea buscar: ");
    String palabra = input.nextLine();

    String traduccion = dicionario.get(palabra);

    if (traduccion == null) {
      System.err.println("La palabra " + palabra + " no esta en el diccionario.");
    } else {
      System.out.println("La traducción de " + palabra + " es " + traduccion + ".");
    }
    System.out.println("-----------------");
  }
}
