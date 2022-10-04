package guiado_poo.parte3;

public class JuegoAdivinaPar extends JuegoAdivinaNumero{

  public JuegoAdivinaPar(int numeroVidas, int numeroBuscado) {
    super(numeroVidas, numeroBuscado);
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
