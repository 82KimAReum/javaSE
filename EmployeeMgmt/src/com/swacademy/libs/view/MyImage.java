package com.swacademy.libs.view;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class MyImage extends JPanel {
	private Image image;
	private Toolkit toolkit;
	private MyCanvas mc;
	MyImage(){
		toolkit = Toolkit.getDefaultToolkit();
		image = toolkit.getImage("./images/jimin.jpg");
		mc = new MyCanvas();
		mc.setSize(700, 500);
		this.add(mc);
	}
	private class MyCanvas extends Canvas{
		@Override
		public void paint(Graphics g){
			int x = this.getWidth() / 2 - image.getWidth(this) / 2 ;
			int y = this.getHeight() / 2 - image.getHeight(this) / 2 ;
			g.drawImage(image, x, y, image.getWidth(this), 
					                 image.getHeight(this), this); 
		}
	}
}
