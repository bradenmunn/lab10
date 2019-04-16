import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class DrawPanel extends JPanel{

	private ArrayList<Shape> shapeList = new ArrayList<Shape>();
	
	/**
	 * Adds the shape to the shapeList
	 * @param shape A Shape object
	 */
	public void addShape(Shape shape)
	{
		shapeList.add(shape);
	}
	
	/**
	 * Automatically executed by Java, draws the shapes
	 * @param graphics Graphics component
	 */
	protected void paintComponent(Graphics graphics)
	{
		for(Shape s: shapeList)
		{
			 s.draw(graphics);
		}
	}
}
