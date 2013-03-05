import java.awt.*;

public class Star
{
	int x;
	int y;
	int size;
	int R, G, B;
	
	public Star()
	{
		x=(int)(Math.random()*StarryNightMain.WIDTH);
		y=(int)(Math.random()*StarryNightMain.HEIGHT);
		size=(int)(Math.random()*5);
		R=(int)(Math.random()*55+200);  //This will generate a number between 200-255.
		G=(int)(Math.random()*55+200);
		B=(int)(Math.random()*55+200);
	}
	
	public void paint(Graphics g)
	{
		g.setColor(new Color(R, G, B));
		g.drawLine((0*size)+x,(1*size)+y,(2*size)+x,(1*size)+y);
		g.drawLine((1*size)+x,(0*size)+y,(1*size)+x,(2*size)+y);
		g.drawLine((0*size)+x,(0*size)+y,(2*size)+x,(2*size)+y);
		g.drawLine((0*size)+x,(2*size)+y,(2*size)+x,(0*size)+y);
//		g.fillOval(0*size+x,0*size+y,size,size);
		
	}
}


	