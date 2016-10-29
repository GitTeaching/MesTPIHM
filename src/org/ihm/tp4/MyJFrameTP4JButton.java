package org.ihm.tp4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyJFrameTP4JButton extends JFrame implements ActionListener{
	
	JButton button1, button2;
	
	public MyJFrameTP4JButton () {
		super();
		initJFrame();
	}
	
	private void initJFrame() {
		this.setSize(500, 400);
		this.setTitle("MyJFrame - TP4");
		this.setLocationRelativeTo(null);
		setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        JPanel panel = new JPanel();     
        this.setContentPane(panel);
        
        button1 = new JButton("OK");
        button1.addActionListener(this);
        panel.add(button1);
        button2 = new JButton("Annuler");
        button2.addActionListener(this);
        panel.add(button2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//Différentes Sources - cas a)
		Object source = e.getSource();
		if(source == button1)
		  System.out.println("Clic OK!");
		else
			System.out.println("Clic Annuler!");
		
		//Différentes Sources - cas b)
		String action= e.getActionCommand();
		if(action.equals("OK"))
			System.out.println("Clic OK!");
		else
			System.out.println("Clic Annuler!");
	}

}
