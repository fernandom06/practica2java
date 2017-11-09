import java.util.Scanner;

public class Main {
    /*lo de la clase aplicacion no tiene mucho sentido*/
    public static void main(String[] args) {
        JuegoAdivinaNumero juego1=new JuegoAdivinaNumero(3,7);
        JuegoAdivinaPar juego2=new JuegoAdivinaPar(3,6);
        JuegoAdivinaImpar juego3=new JuegoAdivinaImpar(3,7);
        juego1.juega();
        juego2.juega();
        juego3.juega();
    }
}
