package breaker;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JPanel;

	public class Interaction extends JPanel implements KeyListener{
		
		ArrayList <Objects> blocks = new ArrayList<Objects>();
		Objects paddle = new Objects(175,400,64,64,"tile.png");
		Objects block = new Objects(100,100,64,64,"green.png");
		
		Interaction(){
			
			
			addKeyListener(this);
			setFocusable(true);
		}
		
		public void paintComponent(Graphics g) {
			block.draw(g, this);
			paddle.draw(g, this);
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			if(e.getKeyCode() == KeyEvent.VK_ENTER) {
				new Thread(()->{
					while(true) {
						update();
						try {
							Thread.sleep(10);
						}catch(InterruptedException err) {
							err.printStackTrace();
						}
						
						
					}
				});
			}
		}

		//@Override
		//public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		//}

		public void update() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		//public void keyTyped(KeyEvent e) {
			
		//}
		

	}


