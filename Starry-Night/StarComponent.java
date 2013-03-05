import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JComponent;

public class StarComponent extends JComponent {

	public void paintComponent (Graphics g)
	{
		g.setColor(Color.BLACK);
		g.fillRect(0,0,StarryNightMain.WIDTH,StarryNightMain.HEIGHT);
		
		for (int i=0; i<StarryNightMain.NUMBER_OF_STARS; i++)
			StarryNightMain.stars.get(i).paint(g);
	}
}
