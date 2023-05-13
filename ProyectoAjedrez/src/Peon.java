
import java.awt.Color;
import java.awt.Point;
import javax.swing.BorderFactory;



public class Peon{
    Tablero Tablero=new Tablero();
    private Point posicion;
    private String color;
    public Peon(Point posicion, String color) {
        this.posicion=posicion;
        this.color=color;
    }
    public void Mover(){
            Tablero.setBorderA6();
    }
   
}