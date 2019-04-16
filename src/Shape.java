import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 * Abstract parent class for a generic Shape
 * @author Braden Munn
 *
 */
public abstract class Shape implements Drawable{

	protected Point[] location;
	private Color color;
	private boolean filled;
	
	/**
	 * Constructor for Shape
	 * @param color Color of the Shape
	 * @param filled Whether or not the Shape is filled
	 */
	public Shape(Color color, boolean filled)
	{
		this.color = color;
		this.filled = filled;
	}
	
	/**
	 * Returns color
	 * @return Color of Shape
	 */
	public Color getColor()
	{
		return color;
	}
	
	/**
	 * Returns whether or not the shape is filled
	 * @return True if filled, false otherwise
	 */
	public boolean isFilled()
	{
		return filled;
	}
	
	/**
	 * Returns the location of all points
	 * @return location array of Point objects
	 */
	public Point[] getLocation()
	{
		return location;
	}

}
