package guiado_poo.parte3;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero {

  public JuegoAdivinaImpar(int numeroVidas, int numeroBuscado) {
    super(numeroVidas, numeroBuscado);
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
