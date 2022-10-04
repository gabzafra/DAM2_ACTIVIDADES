package guiado_poo.parte4;

import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego implements Jugable{

  private final int numeroBuscado;

  public JuegoAdivinaNumero(int numeroVidas, int numeroBuscado) {
    super(numeroVidas);
    this.numeroBuscado = numeroBuscado;
  }
  @Override
  public void muestraNombre() {
    System.out.println("Adivina un número");
  }

  @Override
  public void muestraInfo() {
    System.out.println("El juego consiste en adivinar un número del 0 al 10");
    System.out.println("Deberá adivinarlo antes de quedarse sin vidas");
    muestraVidasRestantes();
  }

  @Override
  public void juega() {
    reiniciarPartida();

    boolean gameOver = false;
    while (!gameOver) {

      int numero = 0;

      boolean isValidNumber = false;
      while (!isValidNumber) {
        System.out.println("Adivina un número entre 0 y 10.");
        Scanner input = new Scanner(System.in);
        numero = input.nextInt();
        isValidNumber = validaNumero(numero);
      }

      if (numero == numeroBuscado) {
        System.out.println("Acertaste!");
        muestraVidasRestantes();
        actualizaRecord();
        gameOver = true;
      } else if (quitaVida()) {
        muestraVidasRestantes();
        System.out.println(
            "El número buscado es " + (numero > numeroBuscado ? "menor" : "mayor") + " que "
                + numero);
      } else {
        gameOver = true;
      }
    }
  }

  public boolean validaNumero(int numero) {
    return true;
  }
}
