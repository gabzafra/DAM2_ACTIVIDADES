package guiado_poo.parte4;

import java.util.Scanner;

public class Aplicacion {

  public static void main(String[] args) {
    Jugable juego;

    boolean haTerminado = false;
    while (!haTerminado) {

      juego = eligeJuego();
      juego.muestraNombre();
      juego.muestraInfo();
      juego.juega();

      System.out.println("Desea jugar de nuevo? (si/no)");
      Scanner input = new Scanner(System.in);
      haTerminado = !input.nextLine().equals("si");
    }
  }

  private static Jugable eligeJuego() {
    Jugable juegoNumero = new JuegoAdivinaNumero(3, 4);
    Jugable juegoPar = new JuegoAdivinaPar(3, 2);
    Jugable juegoImpar = new JuegoAdivinaImpar(3, 9);
    Jugable[] listaJuegos = {juegoNumero, juegoPar, juegoImpar};

    System.out.println("Seleccione un juego de la lista:");
    int opcion = -1;
    while (opcion < 0 || opcion > 2) {
      Scanner input = new Scanner(System.in);
      for (int i = 0; i < listaJuegos.length; i++) {
        System.out.print(i + " . ");
        listaJuegos[i].muestraNombre();
      }
      opcion = input.nextInt();
    }

    return listaJuegos[opcion];
  }
}
