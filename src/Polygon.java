import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public abstract class Polygon extends Shape {

	public Polygon(Color color, boolean filled)
	{
		super(color, filled);
	}
	
	public void draw(Graphics graphics)
	{
		int numPoints = location.length;
		int[] xCoordinates = new int[numPoints];
		int[] yCoordinates = new int[numPoints];
		
		// Extract individual x and y coordinates of Points
		int index = 0;
		for(Point point: location)
		{
			xCoordinates[index] = (int)point.getX();
			yCoordinates[index] = (int)point.getY();
			++index;
		}
		
		// Sets the current color
		graphics.setColor(this.getColor());
		
		if(this.isFilled())
			graphics.fillPolygon(xCoordinates, yCoordinates, numPoints);
		else
			graphics.drawPolygon(xCoordinates, yCoordinates, numPoints);
			
			
	}
}
