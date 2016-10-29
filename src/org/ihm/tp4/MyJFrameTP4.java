package org.ihm.tp4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class MyJFrameTP4 extends JFrame{
	
	public MyJFrameTP4 () {
		super();
		initJFrame();
	}
	
	private void initJFrame() {
		this.setSize(500, 400);
		this.setTitle("MyJFrame - TP4");
		this.setLocationRelativeTo(null);
		setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//JLayeredPane
		/*
		JLabel label = new JLabel();
		label.setBounds(100, 100, 200, 100);
		label.setOpaque(true);
		label.setBackground(Color.cyan);
		this.getLayeredPane().add(label, new Integer(2));		
		JLabel sublabel = new JLabel();
		sublabel.setBounds(80, 80, 180, 80);
		sublabel.setOpaque(true);
		sublabel.setBackground(Color.yellow);
		this.getLayeredPane().add(sublabel, new Integer(1));
		*/
		
		//JPanel
		/*
		JPanel panel = new JPanel();
	    this.setContentPane(panel);
	    
	    JLabel label = new JLabel("Social Media");
	    panel.add(label);
	    
	    DefaultMutableTreeNode root = new DefaultMutableTreeNode("Exemples");
	    DefaultMutableTreeNode twitter = new DefaultMutableTreeNode("Twitter");
	    DefaultMutableTreeNode facebook = new DefaultMutableTreeNode("Facebook");
	    
	    facebook.add(new DefaultMutableTreeNode("Messenger"));
	    
	    DefaultMutableTreeNode  instagram = new DefaultMutableTreeNode("Instagram");
	    
	    root.add(twitter);
	    root.add(facebook);
	    root.add(instagram);
	    
	    JTree tree = new JTree(root);
		panel.add(tree);
		*/
		
		
		//Multiple JPanel
		JPanel panel = new JPanel();
	    panel.setLayout(new BorderLayout());
	    this.setContentPane(panel);
	    
	    JPanel pan1 = new JPanel();
	    panel.add(pan1, BorderLayout.NORTH);
	    pan1.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.red));

	    JPanel pan2 = new JPanel();
	    panel.add(pan2, BorderLayout.SOUTH);
	    pan2.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.red));
	    
	    JLabel label = new JLabel("Social Media");
	    label.setFont(new Font("Serif", Font.PLAIN, 14));
        pan1.add(label);
	    
	    DefaultMutableTreeNode root = new DefaultMutableTreeNode("Examples");
	    DefaultMutableTreeNode twitter = new DefaultMutableTreeNode("Twitter");
	    DefaultMutableTreeNode facebook = new DefaultMutableTreeNode("Facebook");
	    facebook.add(new DefaultMutableTreeNode("Messenger"));
	    DefaultMutableTreeNode  instagram = new DefaultMutableTreeNode("Instagram");
	    root.add(twitter);
	    root.add(facebook);
	    root.add(instagram);	    
	    JTree tree = new JTree(root);
		pan2.add(tree);
	    
	}

}
