package org.ihm.tp7;

import javax.swing.SwingUtilities;

public class TestJFrame {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				MyJFrameTp7 frame = new MyJFrameTp7();
				frame.setVisible(true);
			}
		});
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				MyJFrameTp7JRadioButton frame = new MyJFrameTp7JRadioButton();
				frame.setVisible(true);
			}
		});

	}

}
