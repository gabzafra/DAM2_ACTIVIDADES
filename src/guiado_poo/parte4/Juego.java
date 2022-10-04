package guiado_poo.parte4;

public abstract class Juego {

  private int numeroVidas;
  private final int vidasIniciales;
  private static int record = 0;

  public Juego(int numeroVidas) {
    this.numeroVidas = numeroVidas;
    this.vidasIniciales = numeroVidas;
  }

  public void muestraVidasRestantes() {
    System.out.println("Le quedan " + numeroVidas + " vidas.");
  }

  public boolean quitaVida() {
    numeroVidas--;
    if (numeroVidas > 0) {
      return true;
    } else {
      System.out.println("Juego Terminado.");
      return false;
    }
  }

  public void reiniciarPartida() {
    numeroVidas = vidasIniciales;
  }

  public void actualizaRecord() {
    if (numeroVidas == record) {
      System.out.println("Se ha alcanzado el record.");
    } else if (numeroVidas > record) {
      record = numeroVidas;
      System.out.println("El record se ha batido. El nuevo record es " + record + ".");
    }
  }
}
