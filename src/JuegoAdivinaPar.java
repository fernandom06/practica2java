import java.util.Scanner;

public class JuegoAdivinaPar extends JuegoAdivinaNumero {

    private int numero_adivinar;

    public JuegoAdivinaPar(int vidasIniciales, int numero) {
        super(vidasIniciales, numero);
    }


    public boolean validaNumero(int numero_usuario) {
        if (numero_usuario % 2 == 0) {
            return true;
        } else {
            System.out.println("Ha introducido un número impar, vuelva introducir un número");
            return false;
        }
    }
}
