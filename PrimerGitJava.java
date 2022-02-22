import java.time.LocalDate;
import javax.swing.JFrame;

public class PrimerGitJava extends JFrame
{
	
	public PrimerGitJava()
	{
		super("Hola GIT");
		super.setSize(300, 300);
		super.setLocationRelativeTo(null);
	}
	
	public static void main(String[] args)
	{
		PrimerGitJava ventana = new PrimerGitJava();
		ventana.setVisible(true);
	}
}