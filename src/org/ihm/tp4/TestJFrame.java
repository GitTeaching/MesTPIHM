package org.ihm.tp4;


import javax.swing.SwingUtilities;

public class TestJFrame {

		public static void main(String[] args) {
			
			SwingUtilities.invokeLater(new Runnable(){
				public void run(){
					MyJFrameTP4 frame = new MyJFrameTP4();
					frame.setVisible(true);
				}
			});
			
			SwingUtilities.invokeLater(new Runnable(){
				public void run(){
					MyJFrameTP4JButton frame = new MyJFrameTP4JButton();
					frame.setVisible(true);
				}
			});
	}

}
