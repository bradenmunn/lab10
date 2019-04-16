import java.awt.Color;
import java.awt.Point;

/**
 * Class to create a Square object
 * @author Braden Munn
 *
 */
public class Square extends Rectangle{

	/**
	 * Constructor for a Square
	 * @param pointUL Upper left point
	 * @param width Length of one side
	 * @param color Color of Square
	 * @param filled Whether or not the Square is filled
	 */
	public Square(Point pointUL, int width, Color color, boolean filled)
	{
		super(pointUL, width, width, color, filled);
	}
}
