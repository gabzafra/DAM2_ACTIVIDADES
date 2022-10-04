package guiado_poo.parte4;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero {

  public JuegoAdivinaImpar(int numeroVidas, int numeroBuscado) {
    super(numeroVidas, numeroBuscado);
  }

  @Override
  public void muestraNombre() {
    System.out.println("Adivina un número impar");
  }

  @Override
  public void muestraInfo() {
    System.out.println("El juego consiste en adivinar un número impar del 0 al 10");
    System.out.println("Deberá adivinarlo antes de quedarse sin vidas");
    muestraVidasRestantes();
  }

  @Override
  public boolean validaNumero(int numero) {
    if (numero % 2 == 0) {
      System.err.println("El número no es impar!");
      return false;
    } else {
      return true;
    }
  }
}
