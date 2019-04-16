import java.awt.Color;
import java.awt.Point;

/**
 * Abstract class representing a triangle
 * 
 * DO NOT CHANGE
 * 
 * @author MoSho
 * @version April 11, 2019
 */
public abstract class Triangle extends Polygon 
{

	/**
	 * Constructor for a triangle
	 * 
	 * @param pointLB A point on the base on the triangle
	 * @param color Color of the shape
	 * @param fill True if shape is filled when drawn
	 */
	public Triangle(Point pointLB, Color color, boolean fill) 
	{
		super(color, fill);
        
        location = new Point[3];
        
        // Define lower base point
        location[0] = pointLB; // lower base point
	}

}
