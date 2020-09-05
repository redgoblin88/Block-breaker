package breaker;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("breaker game");
		 
		Interaction Panel = new Interaction();
		 
		 frame.getContentPane().add(Panel);
		 
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setVisible(true);
		 frame.setSize(600,600);
		 
		 frame.setResizable(false);
		 

	}

}
