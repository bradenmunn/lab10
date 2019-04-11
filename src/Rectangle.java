import java.awt.Color;
import java.awt.Point;

public class Rectangle extends Polygon{

	public Rectangle(Point pointUL, int width, int height, Color color, boolean filled)
	{
		super(color, filled);
		location = new Point[4];
		location[0] = pointUL;
		// TODO other points
		
		// Upper right
		int xUR = (int)pointUL.getX() + width;
		int yUR = (int)pointUL.getY();
		Point pointUR = new Point(xUR, yUR);
		location[1] = pointUR;
		
		// Bottom left
		int xBL = (int)pointUL.getX();
		int yBL = (int)pointUL.getY() + height;
		Point pointBL = new Point(xBL, yBL);
		location[2] = pointBL;
		
		// Bottom right
		int xBR = (int)pointUL.getX() + width;
		int yBR = (int)pointUL.getY() + height;
		Point pointBR = new Point(xBR, yBR);
		location[3] = pointBR;
	}
}
