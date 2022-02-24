import java.time.LocalDate;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.*;

public class PrimerGitJava extends JFrame
{
	private final JButton boton; 
	private final PanelCentral central; 	
	
	public PrimerGitJava()
	{
		super("Hola GIT");
		super.setSize(300, 300);
		super.setLocationRelativeTo(null);
		
		central = new PanelCentral();
		
		boton = new JButton("Mensaje");
		
		boton.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				central.actualizarFondo(Color.GREEN);
			}
		});
			
		super.add(boton, BorderLayout.SOUTH);
		super.add(central, BorderLayout.CENTER);
	}
	
	public static void main(String[] args)
	{
		PrimerGitJava ventana = new PrimerGitJava();
		ventana.setVisible(true);
	}
}