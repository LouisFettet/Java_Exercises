import java.util.ArrayList;
import javax.swing.*;

public class StarryNightMain {
	
	public static final int WIDTH=800, HEIGHT=600;
			
	public static final int NUMBER_OF_STARS=(int)(Math.random()*550+50); ///generates a number between 50 and 600

	public static ArrayList <Star> stars;
	
	public static void main(String[] args)
	{
		stars= new ArrayList<Star>();
		for (int i=0; i<NUMBER_OF_STARS; i++)
			stars.add(new Star());
		
		JFrame mywindow = new JFrame();
		mywindow.setSize(WIDTH,HEIGHT);
		mywindow.setTitle("Starry Night");
		mywindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		StarComponent mycomponent=new StarComponent();
		mycomponent.setBounds(0,0,WIDTH,HEIGHT);
		mywindow.add(mycomponent);
		mywindow.setLayout(null);
		mywindow.setVisible(true); 
	}
}
