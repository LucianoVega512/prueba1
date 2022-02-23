import java.time.LocalDate;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;

public class PrimerGitJava extends JFrame
{
	private final JButton boton; 
	//private final JLabel etiqueta; 	
	
	public PrimerGitJava()
	{
		super("Hola GIT");
		super.setSize(300, 300);
		super.setLocationRelativeTo(null);
		
		boton = new JButton("Mensaje");
		
		super.add(boton, BorderLayout.SOUTH);
	}
	
	public static void main(String[] args)
	{
		PrimerGitJava ventana = new PrimerGitJava();
		ventana.setVisible(true);
	}
}