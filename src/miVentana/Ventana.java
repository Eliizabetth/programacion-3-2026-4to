package miVentana;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;


public class Ventana extends JFrame{
	public Ventana(){
		setSize(500, 500);
		Toolkit tk = Toolkit.getDefaultToolkit();
		//Image icono = tk.getImage("src/img/icono.png");
		//setIconImage(icono);
		
		PanelitoVentana panelito = new PanelitoVentana();
		add(panelito);
	
	}
	
}
