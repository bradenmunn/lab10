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
		
		location = new Point[1];
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
		Point upperL = location[0];
		int x = upperL.x;
		int y = upperL.y;
		
		graphics.setColor(this.getColor());
		if(this.isFilled())
			graphics.fillOval(x, y, diameter1, diameter2);
		else
			graphics.drawOval(x, y, diameter1, diameter2);

	}
}
