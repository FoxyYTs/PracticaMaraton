
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;



public class Peon{

    private String Color;
    private Tablero T=new Tablero();
    private JLabel Ficha=new JLabel();
    public Peon(JLabel Ficha,String Color, Tablero T) {
        this.Color=Color;
        this.T=T;
        this.Ficha=Ficha;
    }
    public void Mover(){
        if(Ficha.getLocation().equals(T.Matriz()[1][0])){
            T.setBorderA6();
            T.setBorderA5();
            //Receptor de click en A6
            T.getA6().addMouseListener(new MouseAdapter() {            
            @Override
            public void mouseClicked(MouseEvent e) {
                Ficha.setLocation(T.Matriz()[2][0]);
            }
            });
            //Receptor de click en A5
            T.getA5().addMouseListener(new MouseAdapter() {            
            @Override
            public void mouseClicked(MouseEvent e) {
                Ficha.setLocation(T.Matriz()[3][0]);
            }
            });
        }  
    }
}