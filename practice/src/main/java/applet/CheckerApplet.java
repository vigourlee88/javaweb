package applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class CheckerApplet  extends Applet {
	
	int aquareSize = 50;
	public void init() {
		String squareSizeParam = getParameter("squarsSize");
		parseSquareSize(squareSizeParam);
		String colorParam = getParameter("color");
		Color fg = parseColor(colorParam);
		setBackground (Color.black);
		setForeground(fg);
	}
	private void parseSquareSize(String param) {
		if(param == null)
			return;
		try {
			int squareSize = Integer.parseInt(param);
		}catch(Exception e) {
		}
	}
	private Color parseColor(String param) {
		return null;}
	public void paint (Graphics g) {}


}
