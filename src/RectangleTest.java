import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
	private Rectangle r1 = new Rectangle(new Point(100, 100), 100, 50, Color.BLUE, true);
	private Rectangle r2 = new Rectangle(new Point(100, 100), 50, 25, Color.RED, false);
	
	private Square s1 = new Square(new Point(200, 200), 50, Color.GREEN, true);
	private Square s2 = new Square(new Point(200, 200), 25, Color.YELLOW, false);
	
	@Test
	public void testRectangle()
	{
		// Verify the quantity of points for each shape
        Assert.assertEquals("Quantity of points defining the Rectangle is more than 4", 4, r1.getLocation().length);
        Assert.assertEquals("Quantity of points defining the Rectangle is more than 4", 4, r2.getLocation().length);
        Assert.assertEquals("Quantity of points defining the Square is more than 4", 4, s1.getLocation().length);
        Assert.assertEquals("Quantity of points defining the Square is more than 4", 4, s2.getLocation().length);
        
        // Verify the location of points for a rectangle and a square
        Assert.assertEquals("Incorrect UL Point for the Rectangle", new Point(100, 100), r1.getLocation()[0]);
        Assert.assertEquals("Incorrect UR Point for the Rectangle", new Point(200, 100), r1.getLocation()[1]);
        Assert.assertEquals("Incorrect BL Point for the Rectangle", new Point(100, 150), r1.getLocation()[2]);
        Assert.assertEquals("Incorrect BR Point for the Rectangle", new Point(200, 150), r1.getLocation()[3]);
        Assert.assertEquals("Incorrect UL Point for the Square", new Point(200, 200), s1.getLocation()[0]);
        Assert.assertEquals("Incorrect UR Point for the Square", new Point(250, 200), s1.getLocation()[1]);
        Assert.assertEquals("Incorrect BL Point for the Square", new Point(200, 250), s1.getLocation()[2]);
        Assert.assertEquals("Incorrect BR Point for the Square", new Point(250, 250), s1.getLocation()[3]);
        
        // Verify the colors for each shape
        Assert.assertEquals("Incorrect color for the Rectangle", Color.BLUE, r1.getColor());
        Assert.assertEquals("Incorrect color for the Rectangle", Color.RED, r2.getColor());
        Assert.assertEquals("Incorrect color for the Square", Color.GREEN, s1.getColor());
        Assert.assertEquals("Incorrect color for the Square", Color.YELLOW, s2.getColor());
        
        // Verify the appropriate filled flag for each shape
        Assert.assertTrue("Incorrect flag for filled for the Rectangle", r1.isFilled());
        Assert.assertFalse("Incorrect flag for filled for the Rectangle", r2.isFilled());
        Assert.assertTrue("Incorrect flag for filled for the Square", s1.isFilled());
        Assert.assertFalse("Incorrect flag for filled for the Square", s2.isFilled());

	}
}
