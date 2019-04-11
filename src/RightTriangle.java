import java.awt.Color;
import java.awt.Point;

public class RightTriangle extends Triangle{

	public RightTriangle(Point pointRA, int base, int height, Color color, boolean fill)
	{
		super(pointRA, color, fill);
		
		// Calculates and stores point for the lower base
		int xLB = (int)pointRA.getX() + base;
		int yLB = (int)pointRA.getY();
		Point pointLB = new Point(xLB, yLB);
		location[1] = pointLB;
		
		// Calculates and stores point for the upper left corner of the triangle
		int xUL = (int)pointRA.getX();
		int yUL = (int)pointRA.getY() + height;
		Point pointUL = new Point(xUL, yUL);
		location[2] = pointUL;
		
	}
}
