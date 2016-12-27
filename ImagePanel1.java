package movie_manager;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

class ImagePanel1 extends JPanel{
	Image img;
	public void paint(Graphics g){
	 try {
		img = ImageIO.read(new File("D://ËÙ¶È¼¤Çé.jpg"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
		g.drawImage(img, 0, 0, 800, 600, null);
		
	}
}
