package org.ihm.tp8;
import javax.swing.SwingUtilities;


public class TestJFrame {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				MyJFrameTP8 frame = new MyJFrameTP8();
				frame.setVisible(true);
			}
		});

	}

}
