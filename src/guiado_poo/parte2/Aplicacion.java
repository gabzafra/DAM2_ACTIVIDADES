package guiado_poo.parte2;

public class Aplicacion {
  public static void main(String[] args) {
    Juego elJuego = new Juego(5);
    Juego elOtroJuego = new Juego(5);

    elJuego.quitaVida();
    elJuego.muestraVidasRestantes();
    elJuego.reiniciarPartida();
    elJuego.muestraVidasRestantes();
    elJuego.actualizaRecord();
    elOtroJuego.actualizaRecord();
  }
}
