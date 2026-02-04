package miVentana;
import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		Ventana ventanita = new Ventana();
		ventanita.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanita.setLocation(200,100);
		ventanita.setResizable(false);
		ventanita.setTitle("Ventanita");
		
		ventanita.setVisible(true);
	}
}
