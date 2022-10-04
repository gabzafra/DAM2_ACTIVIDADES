package guiado_poo.parte4;

public class Aplicacion {

  public static void main(String[] args) {
    JuegoAdivinaNumero juegoNumero = new JuegoAdivinaNumero(3, 4);
    JuegoAdivinaNumero juegoPar = new JuegoAdivinaPar(3, 2);
    JuegoAdivinaNumero juegoImpar = new JuegoAdivinaImpar(3, 9);

    juegoNumero.muestraNombre();
    juegoNumero.muestraInfo();
    juegoNumero.juega();

    juegoPar.muestraNombre();
    juegoPar.muestraInfo();
    juegoPar.juega();

    juegoImpar.muestraNombre();
    juegoImpar.muestraInfo();
    juegoImpar.juega();
  }
}
