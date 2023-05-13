

public class Rey extends Fichas {
    private String color,posicion;

    public Rey (String posicion, String color) {
        super(posicion, color);
    }

    public String getColor () {
        return color;
    }

    public String getPosicion () {
        return posicion;
    }

    public void setColor (String color) {
        this.color=color;
    }

    public void setPosicion (String pos) {
        this.posicion=pos;
    }

    public void mover (String mover) {
        
    }
    
}
