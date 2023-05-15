
import java.awt.Point;



public class Peon{

    private Point Posicion;
    private String Color;
    private Tablero T=new Tablero();
    public Peon(String Color, Tablero T) {
        this.Color=Color;
        this.T=T;
    }
    public void setPosicion(Point Posicion){
        this.Posicion=Posicion;
    }
    public void Mover(){
        if(Posicion.equals(T.Matriz()[1][0])){
            T.setBorderA6();
            T.setBorderA5();
        }
    }
   
}