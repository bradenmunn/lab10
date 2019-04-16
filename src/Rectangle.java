import java.awt.Color;
import java.awt.Point;

/**
 * Class to create a Rectangle
 * @author Braden Munn
 *
 */
public class Rectangle extends Polygon{

	/**
	 * 
	 * @param pointUL Upper left point
	 * @param width Rectangle's width
	 * @param height Rectangle's height
	 * @param color Rectangle's color
	 * @param filled Whether or not the Rectangle is filled
	 */
	public Rectangle(Point pointUL, int width, int height, Color color, boolean filled)
	{
		super(color, filled);
		location = new Point[4];
		location[0] = pointUL;
		
		// Upper right
		int xUR = (int)pointUL.getX() + width;
		int yUR = (int)pointUL.getY();
		Point pointUR = new Point(xUR, yUR);
		location[1] = pointUR;
		
		// Bottom right
		int xBR = (int)pointUL.getX() + width;
		int yBR = (int)pointUL.getY() + height;
		Point pointBR = new Point(xBR, yBR);
		location[2] = pointBR;
		
		// Bottom left
		int xBL = (int)pointUL.getX();
		int yBL = (int)pointUL.getY() + height;
		Point pointBL = new Point(xBL, yBL);
		location[3] = pointBL;
		
		
	}
}
