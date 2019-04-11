import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Oval extends Shape{
	private int diameter1;
	private int diameter2;
	
	/**
	 * 
	 * @param pointUL Upper left corner of the bounding box
	 * @param d1 Diameter left to right
	 * @param d2 Diameter top to bottom
	 * @param color The color
	 * @param filled
	 */
	public Oval(Point pointUL, int d1, int d2, Color color, boolean filled)
	{
		super(color, filled);
		diameter1 = d1;
		diameter2 = d2;
		location[0] = pointUL;
		
	}
	
	public int getDiameter1()
	{
		return diameter1;
	}
	
	public int getDiameter2()
	{
		return diameter2;
	}
	
	@Override
	public void draw(Graphics graphics)
	{
		Point[] list = getLocation();
		Point upperL = list[0];
		int x = (int)upperL.getX();
		int y = (int)upperL.getY();
		graphics.drawOval(x, y, diameter1, diameter2);
	}
}
