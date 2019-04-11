import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
	private RightTriangle r1 = new RightTriangle(new Point(100, 100), 50, 30, Color.RED, true);
	private IsoscelesTriangle i1 = new IsoscelesTriangle(new Point(200, 200), 50, 100, Color.BLUE, false);
	
	@Test
	public void testTriangleConstructors()
	{
		// Verify the quantity of points for each shape
        Assert.assertEquals("Quantity of points defining the RightTriangle is more than 3", 3, r1.getLocation().length);
        Assert.assertEquals("Quantity of points defining the IsoscelesTriangle is more than 3", 3, i1.getLocation().length);
        
        // Verify the location of each Point for each shape
        Assert.assertEquals("Incorrect location for the RightTriangle", new Point(100, 100), r1.getLocation()[0]);
        Assert.assertEquals("Incorrect location for the RightTriangle", new Point(150, 100), r1.getLocation()[1]);
        Assert.assertEquals("Incorrect location for the RightTriangle", new Point(100, 130), r1.getLocation()[2]);
        Assert.assertEquals("Incorrect location for the IsoscelesTriangle", new Point(200, 200), i1.getLocation()[0]);
        Assert.assertEquals("Incorrect location for the IsoscelesTriangle", new Point(250, 200), i1.getLocation()[1]);
        Assert.assertEquals("Incorrect location for the IsoscelesTriangle", new Point(225, 300), i1.getLocation()[2]);
        
        // Verify the colors for each shape
        Assert.assertEquals("Incorrect color for the RightTriangle", Color.RED, r1.getColor());
        Assert.assertEquals("Incorrect color for the IsoscelesTriangle", Color.BLUE, i1.getColor());
        
        // Verify the appropriate filled flag for each shape
        Assert.assertTrue("Incorrect flag for filled for the RightTriangle", r1.isFilled());
        Assert.assertFalse("Incorrect flag for filled for the IsoscelesTriangle", i1.isFilled());
        }
}
