public class Juego {
    private int vidas;
    private int vidasInicial;
    private int record=0;

    public Juego(int vidasIniciales){
        vidas=vidasIniciales;
        vidasInicial=vidasIniciales;
    }
    /*public void muestraVidasRestantes(){
        System.out.println("Te quedan "+vidas+" vidas");
    }*/
    public int muestraVidasRestantes(){
        System.out.println("Te quedan "+vidas+" vidas");
        return vidas;
    }

    public int quitaVida(){
        vidas--;
        if(vidas<1){
            System.out.println("Juego Terminado");
        }
        return vidas;
    }

    public void reiniciaPartida(){
        vidas=vidasInicial;
    }

    public void actualizaRecord(){
        if (vidas==record){
            System.out.println("Has alcanzado el record");
        }
        if (vidas>record){
            record=vidas;
            System.out.println("Se ha batido el record, el nuevo valor es "+record);
        }
    }

}

