package guiado_poo.parte4;

public class JuegoAdivinaPar extends JuegoAdivinaNumero {

  public JuegoAdivinaPar(int numeroVidas, int numeroBuscado) {
    super(numeroVidas, numeroBuscado);
  }

  @Override
  public void muestraNombre() {
    System.out.println("Adivina un número par");
  }

  @Override
  public void muestraInfo() {
    System.out.println("El juego consiste en adivinar un número par del 0 al 10");
    System.out.println("Deberá adivinarlo antes de quedarse sin vidas");
    muestraVidasRestantes();
  }

  @Override
  public boolean validaNumero(int numero) {
    if (numero % 2 != 0) {
      System.err.println("El número no es par!");
      return false;
    } else {
      return true;
    }
  }
}
