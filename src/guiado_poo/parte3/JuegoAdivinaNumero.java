package guiado_poo.parte3;

import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {

  private int numeroBuscado;

  public JuegoAdivinaNumero(int numeroVidas, int numeroBuscado) {
    super(numeroVidas);
    this.numeroBuscado = numeroBuscado;
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
