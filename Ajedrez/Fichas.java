package Ajedrez;

public class Fichas {
    private String posicion;
    private String color;
    public Fichas(String posicion, String color){
        this.posicion = posicion;
        this.color = color;
    }

    public void setPosicionX(String posicion){
        this.posicion = posicion;
    }

    public String getPosicion(){
        return posicion;
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
