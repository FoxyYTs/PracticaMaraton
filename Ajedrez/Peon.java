package Ajedrez;

public class Peon extends Fichas{
    private String posición,color;
    public Peon(String posicion, String color){
        super(posicion, color);
        this.posición = posicion;
        this.color = color;
    }

    public void setPosicion(String posicion){
        this.posición = posicion;
    }

    public String getPosicion(){
        return posición;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }
}