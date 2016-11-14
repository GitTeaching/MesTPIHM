package org.ihm.tp5;

import java.awt.Font;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyJFrameTP5ComponentListener extends JFrame implements ComponentListener {

	private JLabel labelx;
	private JLabel labely;
	
	public MyJFrameTP5ComponentListener (){
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
		labelx.setFont(new Font("Serif", Font.BOLD, 16));
		panel.add(labelx);
		
		labely = new JLabel("Y = ");
		labely.setFont(new Font("Serif", Font.BOLD, 16));
		panel.add(labely);
		
		addComponentListener(this);
	}

	@Override
	public void componentResized(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentMoved(ComponentEvent e) {
		int x = e.getComponent().getX();
		int y = e.getComponent().getY();
		
		labelx.setText("X = " + x);
		labely.setText("Y= " + y);
	}

	@Override
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentHidden(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}
}
