import java.awt.Color;
import java.awt.Point;
import java.io.IOException;

import javax.swing.JFrame;

public class DrawFrame extends JFrame{

	private static DrawPanel drawPanel;
	
	/**
	 * Creates an image of a snowman in the window
	 * @param title Title for the JFrame
	 * @throws IOException for file
	 */
	public DrawFrame(String title) throws IOException
	{
		super(title);
		this.setSize(1000, 1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		DrawPanel panel = new DrawPanel();
		panel.setSize(1000, 1000);
		panel.setBounds(0, 0, 1000, 1000);
		this.add(panel);
		
		// Background
		Square sky = new Square(new Point(0,0), 1000, Color.BLUE, true);
		Rectangle snow = new Rectangle(new Point(0, 600), 1000, 400, Color.WHITE, true);
		
		// Snowman body
		Oval baseOutline = new Oval(new Point(345, 495), 310, 210, Color.BLACK, true);
			Oval base = new Oval(new Point(350, 500), 300, 200, Color.WHITE, true);
		Circle middleOutline = new Circle(new Point(395, 295), 210, Color.BLACK, true);
			Circle middle = new Circle(new Point(400, 300), 200, Color.WHITE, true);	
		Circle headOutline = new Circle(new Point(420, 145), 160, Color.BLACK, true);
			Circle head = new Circle(new Point(425, 150), 150, Color.WHITE, true);
		
		// Buttons
		Diamond buttonTop = new Diamond(new Point(495, 380), 10, Color.BLACK, true);
		Diamond buttonMiddle = new Diamond(new Point(495, 440), 10, Color.BLACK, true);
		Diamond buttonBottom = new Diamond(new Point(495, 530), 10, Color.BLACK, true);
		
		// Arms
		Sinusoid rightArm = new Sinusoid(new Color(101, 67, 33), new Point(600, 400), 1, 4, 10);
		Sinusoid leftArm = new Sinusoid(new Color(101, 67, 33), new Point(20, 400), 1, 4, 10);
		
		// Face
		RightTriangle nose = new RightTriangle(new Point(490, 260), 35, -25, Color.ORANGE, true);
		IsoscelesTriangle leftEye = new IsoscelesTriangle(new Point(465, 215), 20, -20, Color.BLACK, true);
		IsoscelesTriangle rightEye = new IsoscelesTriangle(new Point(515, 215), 20, -20, Color.BLACK, true);
		
		panel.addShape(sky);
		panel.addShape(snow);
		panel.addShape(baseOutline);
		panel.addShape(base);
		panel.addShape(middleOutline);
		panel.addShape(middle);
		panel.addShape(headOutline);
		panel.addShape(head);
		
		panel.addShape(buttonTop);
		panel.addShape(buttonMiddle);
		panel.addShape(buttonBottom);
		
		panel.addShape(rightArm);
		panel.addShape(leftArm);
		
		panel.addShape(nose);
		panel.addShape(leftEye);
		panel.addShape(rightEye);
		

		PanelToImage.makePanelPNGImage(panel, "Snowman");
		
		
		
	}
	
	public static void main(String[] args) throws IOException
	{
		DrawFrame frame = new DrawFrame("Snowman");
	}
}
