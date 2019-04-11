import java.awt.Color;
import java.awt.Point;

public class Rectangle extends Polygon{

	public Rectangle(Point pointUL, int width, int height, Color color, boolean filled)
	{
		super(color, filled);
		location[0] = pointUL;
	}
}
