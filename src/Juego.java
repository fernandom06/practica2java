public abstract class Juego {
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

    public boolean quitaVida(){
        vidas--;
        if(vidas==0){
            System.out.println("Juego Terminado");
            return false;
        }
        else {
            System.out.println("El número de vidas restantes son: "+vidas);

            System.out.println("Por favor vuelva a intentarlo");
            return true;
        }
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

    public abstract void juega();

}

