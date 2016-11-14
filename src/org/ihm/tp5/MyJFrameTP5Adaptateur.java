package org.ihm.tp5;

import java.awt.Font;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyJFrameTP5Adaptateur extends JFrame{
	
	private JLabel labelx;
	private JLabel labely;
	
	public MyJFrameTP5Adaptateur (){
		super();
		initJFrame(); 
	}
	
	public void initJFrame() {
		this.setTitle("JFrame - TP 5");
		this.setSize(500, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		this.setContentPane(panel);
		
		labelx = new JLabel("X = ");
		labelx.setFont(new Font("Serif", Font.PLAIN, 18));
		panel.add(labelx);
		
		labely = new JLabel("Y = ");
		labely.setFont(new Font("Serif", Font.PLAIN, 18));
		panel.add(labely);
		
		addComponentListener(new MoveAdapter());
	}
	
	private class MoveAdapter extends ComponentAdapter {
	
		@Override
		public void componentMoved(ComponentEvent e) {
			int x = e.getComponent().getX();
			int y = e.getComponent().getY();
			
			labelx.setText("X = " + x);
			labely.setText("Y= " + y);
		}
		
	}

}
