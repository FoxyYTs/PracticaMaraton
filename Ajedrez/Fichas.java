package Ajedrez;

public class Fichas {
    private int posicionx,posiciony;
    private String color;
    public Fichas(int posicionx,int posiciony, String color){
        this.posicionx = posicionx;
        this.posiciony = posiciony;
        this.color = color;
    }

    public void setPosicionX(int posicionx){
        this.posicionx = posicionx;
    }

    public void setPosicionY(int posiciony){
        this.posiciony = posiciony;
    }

    public int getPosicionX(){
        return posicionx;
    }

    public int getPosicionY(){
        return posiciony;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void mover(int movimientox, int movimientoy){
    }
}
