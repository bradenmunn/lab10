import java.awt.Color;
import java.awt.Point;

/**
 * Class to create a RightTriangle
 * @author Braden Munn
 *
 */
public class RightTriangle extends Triangle{

	/**
	 * 
	 * @param pointRA Point closest to the right angle
	 * @param base Length of base
	 * @param height Length from base to upper most point
	 * @param color Color of the RightTriangle
	 * @param fill Whether or not the RightTriangle is filled
	 */
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
