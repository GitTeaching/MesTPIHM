package org.ihm.tp5;

import javax.swing.SwingUtilities;


public class TestJFrame {

		public static void main(String[] args) {
			
			SwingUtilities.invokeLater(new Runnable(){
				public void run(){
					MyJFrameTP5 frame = new MyJFrameTP5();
					frame.setVisible(true);
				}
			});		
			
			SwingUtilities.invokeLater(new Runnable(){
				public void run(){
					MyJFrameTP5ComponentListener frame = new MyJFrameTP5ComponentListener();
					frame.setVisible(true);
				}
			});		
			
			SwingUtilities.invokeLater(new Runnable(){
				public void run(){
					MyJFrameTP5Adaptateur frame = new MyJFrameTP5Adaptateur();
					frame.setVisible(true);
				}
			});		
	}

}
