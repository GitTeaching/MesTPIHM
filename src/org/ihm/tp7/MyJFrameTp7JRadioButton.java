package org.ihm.tp7;

import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class MyJFrameTp7JRadioButton extends JFrame implements ItemListener{
	
	JLabel displayItem;
	JLabel displayFonts;
	JLabel sbar;
	
	
	public MyJFrameTp7JRadioButton () {
		super();
		initJFrame();
	}
	
	private void initJFrame() {
		this.setSize(500, 400);
		this.setTitle("JRadioButton");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//JRadioButton
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JLabel lbl = new JLabel("Social Media");
		panel.add(Box.createRigidArea(new Dimension(20, 20)));
		panel.add(lbl);
		
        ButtonGroup group = new ButtonGroup();
        
        JRadioButton rb1 = new JRadioButton("Facebook", true);
        rb1.setMnemonic(KeyEvent.VK_F);
        
        JRadioButton rb2 = new JRadioButton("Twitter");
        rb2.setMnemonic(KeyEvent.VK_T);
        
        JRadioButton rb3 = new JRadioButton("Instagram");
        rb3.setMnemonic(KeyEvent.VK_I);
        
        group.add(rb1);
        group.add(rb2);
        group.add(rb3);
        
        rb1.addItemListener(this);
        rb2.addItemListener(this);
        rb3.addItemListener(this);
        
        panel.add(Box.createRigidArea(new Dimension(20, 10)));
		panel.add(rb1);
		panel.add(Box.createRigidArea(new Dimension(20, 10)));
		panel.add(rb2);
		panel.add(Box.createRigidArea(new Dimension(20, 10)));
		panel.add(rb3);
		panel.add(Box.createRigidArea(new Dimension(20, 50)));
		
		sbar = new JLabel("Selected: Facebook");
        panel.add(sbar);

		
		this.setContentPane(panel);
		
	}
	
	  @Override
	    public void itemStateChanged(ItemEvent e) {
	        if ((e.getStateChange() == ItemEvent.SELECTED)) {
	            JRadioButton button = (JRadioButton) e.getSource();
	            String text = button.getText();
	            sbar.setText("Selected : " + text);            
	        }
	        
	    }


}

