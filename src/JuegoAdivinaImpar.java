public class JuegoAdivinaImpar extends JuegoAdivinaNumero {
    public JuegoAdivinaImpar(int vidasIniciales, int numero){
        super(vidasIniciales,numero);
    }

    public boolean validaNumero(int numero_usuario) {
        if (numero_usuario % 2 == 1) {
            return true;
        } else {
            System.out.println("Ha introducido un número par, vuelva introducir un número");
            return false;
        }
    }
}
