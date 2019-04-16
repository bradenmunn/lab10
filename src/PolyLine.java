import java.awt.Color;
import java.awt.Point;

/**
 * Creates a Polygon out of two connected points, creates a parallel line
 * of length THICKNESS away from the original line, and connects the 4 points
 * @author Braden Munn
 *
 */
public class PolyLine extends Polygon{
	
	
/**
 * Creates a parallel line of length THICKNESS away from the original line, 
 * and connects the 4 points
 * @param pointUL Upper left point
 * @param pointUR Upper right point
 * @param thickness Distance from initial line to second line
 * @param color Color of the polygon
 * @param fill Whether or not the Polygon is filled
 */
	public PolyLine(Point pointUL, Point pointUR, int thickness, Color color, boolean fill) {
		super(color, fill);
		location = new Point[4];
		location[0] = pointUL;
		location[1] = pointUR;
		
		// Adds bottom left point (will be top left if negative thickness value)
		int xBL = (int)pointUL.getX();
		int yBL = (int)pointUL.getY() + thickness;
		Point pointBL = new Point(xBL, yBL);
		location[2] = pointBL;
		
		// Adds bottom right point (will be top right if negative thickness value)
		int xBR = (int)pointUR.getX();
		int yBR = (int)pointUR.getY() + thickness;
		Point pointBR = new Point(xBR, yBR);
		location[3] = pointBR;
	}
}
