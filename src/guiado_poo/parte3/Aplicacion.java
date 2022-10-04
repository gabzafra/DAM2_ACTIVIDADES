package guiado_poo.parte3;

public class Aplicacion {

  public static void main(String[] args) {
    Juego juegoNumero = new JuegoAdivinaNumero(3, 4);
    Juego juegoPar = new JuegoAdivinaPar(3, 2);
    Juego juegoImpar = new JuegoAdivinaImpar(3, 9);
    juegoNumero.juega();
    juegoPar.juega();
    juegoImpar.juega();
  }
}
