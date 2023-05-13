package Ajedrez;

public class Peon extends Fichas{
    public Peon(int posicionx,int posiciony, String color){
        super(posicionx,posiciony,color);
    }

    @Override
    public void mover(int movimientox, int movimientoy){
        if (getColor().equals("W")){
            if(getPosicionY() == 2){
                
            }
        }
    }
}