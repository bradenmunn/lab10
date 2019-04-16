import java.awt.Color;
import java.awt.Point;

/**
 * Class to create an isosceles triangle 
 * @author Braden Munn
 *
 */
public class IsoscelesTriangle extends Triangle{

	/**
	 * 
	 * @param pointLB Base point
	 * @param base Length of the base
	 * @param height Vertical length from base point to top point
	 * @param color Color of the triangle
	 * @param fill Whether or not the shape is filled
	 */
	public IsoscelesTriangle(Point pointLB, int base, int height, Color color, boolean fill)
	{
		super(pointLB, color, fill);
		location = new Point[3];
		location[0] = pointLB;
		
		// Other base point
		int xRB = (int)pointLB.getX() + base;
		int yRB = (int)pointLB.getY();
		Point pointRB = new Point(xRB, yRB);
		location[1] = pointRB;
		
		// Apex point
		int xApex = (int)pointLB.getX() + base/2;
		int yApex = (int)pointLB.getY() + height;
		Point pointApex = new Point(xApex, yApex);
		location[2] = pointApex;
	}
}
