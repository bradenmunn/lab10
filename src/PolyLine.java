import java.awt.Color;
import java.awt.Point;

public class PolyLine extends Polygon{
	
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
