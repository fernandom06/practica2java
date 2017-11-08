public class Main {
    /*lo de la clase aplicacion no tiene mucho sentido*/
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Juego juego1=new Juego(1);
        juego1.muestraVidasRestantes();
        juego1.quitaVida();
        juego1.reiniciaPartida();
        juego1.muestraVidasRestantes();
        juego1.actualizaRecord();
        Juego juego2=new Juego(5);
    }
}
