import java.awt.Color;
import java.awt.Point;

public class RightTriangle extends Triangle{

	public RightTriangle(Point pointRA, int base, int height, Color color, boolean fill)
	{
		super(pointRA, color, fill);
		
		// Calculates and stores point for the lower base
		int xBase = (int)pointRA.getX() + base;
		int yBase = (int)pointRA.getY();
		Point pointLeftOrRightOfBase = new Point(xBase, yBase);
		location[1] = pointLeftOrRightOfBase;
		
		// Calculates and stores point for the upper left corner of the triangle
		int xHeight = (int)pointRA.getX();
		int yHeight = (int)pointRA.getY() + height;
		Point pointAboveOrBelowBase = new Point(xHeight, yHeight);
		location[2] = pointAboveOrBelowBase;
	}
}
