package Ajedrez;

public class Peon extends Fichas{
    public Peon(String posicion, String color){
        super(posicion, color);
    }

    @Override
    public void mover(int movimientox, int movimientoy){
        if(getColor().equals("W")){
            if (getPosicion().substring(0, 1).equals("2")){
                
            }
        }
    }
}