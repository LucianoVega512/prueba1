import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class PanelCentral extends JPanel
{
	private Color color;
	
	public PanelCentral()
	{
		this.color = Color.WHITE;
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		this.setBackground(color);
	}	
	
	public void actualizarFondo(Color c)
	{
		this.color = c;
		super.repaint();
	}
}