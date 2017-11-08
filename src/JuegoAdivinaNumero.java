import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {
    private int numero_adivinar;



    public JuegoAdivinaNumero(int vidasIniciales, int numero){
        super(vidasIniciales);
        numero_adivinar=numero;
    }

    public void juega() {
        this.reiniciaPartida();
        int numero_usuario;
        boolean salir=true;

        Scanner lector=new Scanner(System.in);

        while (salir==true) {
            System.out.println("Adivina el numero entre el 1 y el 10");
            numero_usuario = lector.nextInt();
            if (numero_usuario == numero_adivinar) {
                actualizaRecord();
                System.out.println("Enhorabuena has acertado");
                salir=false;
            }
            else {
                salir=quitaVida();
                if(salir){
                    if (numero_adivinar>numero_usuario) System.out.println("el numero a adivinar es mayor ");
                    else System.out.println("el numero a adivinar es menor ");
                }
            }
        }
    }
}
