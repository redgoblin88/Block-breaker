package breaker;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Objects  extends Rectangle{
	Image pic;
	boolean destroyed;

	int posx = 0;
	int posy = 0;
	int objw = 50;
	int objh = 50;
	
	//gets objects from interaction.java ln22
	//this is mainly designed to get the image
	Objects(int posx, int posy, int w, int h, String s){
	this.posx = posx;
	this.posy = posy;
	this.objw = w;
	this.objh = h;
	
	try {pic = ImageIO.read(new File("src/"+s));
	} catch (IOException e) {
		e.printStackTrace();}
	
	}
	public void draw(Graphics g, Component c) {
		if (!destroyed)
			//(src,x,y,w,h)
			
			g.drawImage(pic,posx,posy,objw,objh,c);
			g.drawImage(pic,posx+64,posy,objw,objh,c);
	}

}
