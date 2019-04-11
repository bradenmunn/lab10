import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class DrawPanel extends JPanel{

	private ArrayList<Shape> shapeList;
	
	public void addShape(Shape shape)
	{
		shapeList.add(shape);
	}
	
	protected void paintComponent(Graphics graphics)
	{
		
	}
}
