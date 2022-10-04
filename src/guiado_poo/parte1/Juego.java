package guiado_poo.parte1;

public class Juego {

  public int numeroVidas;

  public Juego(int numeroVidas) {
    this.numeroVidas = numeroVidas;
  }

  public void muestraVidasRestantes() {
    System.out.println("Le quedan " + numeroVidas + " vidas.");
  }

  public static void main(String[] args) {
    Juego elJuego = new Juego(5);
    elJuego.muestraVidasRestantes();
    elJuego.numeroVidas--;
    Juego elOtroJuego = new Juego(5);
    elJuego.muestraVidasRestantes();
    elOtroJuego.muestraVidasRestantes();
  }
}
