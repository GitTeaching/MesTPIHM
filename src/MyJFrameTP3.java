import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class MyJFrameTP3 extends JFrame{

	public MyJFrameTP3 () {
		super();
		initJFrame();
	}
	
	private void initJFrame() {
		this.setSize(500, 400);
		this.setTitle("MyJFrame - TP3");
		this.setLocationRelativeTo(null);
		setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Exemples d'utilisation de RootPane
		this.getRootPane().setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.BLACK));
	    this.setUndecorated(true);
	    this.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
	    
	    //Exemples d'utilisation de ContentPane - Positionnement
	    
	    //Cas positionnement : FlowLayout
	    /*
	    this.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
	    JLabel label1 = new JLabel("Label 1");
	    this.getContentPane().add(label1);
	    JLabel label2 = new JLabel("Label 2");
	    this.getContentPane().add(label2);
	    */
	   
	    //Cas positionnement : BorderLayout
	    /*
	    this.getContentPane().setLayout(new BorderLayout());
	    JLabel label1 = new JLabel("Label 1");
	    this.getContentPane().add(label1, BorderLayout.NORTH);
	    JLabel label2 = new JLabel("Label 2");
	    this.getContentPane().add(label2, BorderLayout.SOUTH);
	    */
	    
	    //Cas positionnement : GridLayout
	    /*
	    this.getContentPane().setLayout(new GridLayout(2, 3, 5, 5));
	    */
	    
	    //Cas positionnement : BoxLayout + RigidArea
	    BoxLayout boxLayout = new BoxLayout(getContentPane(), BoxLayout.Y_AXIS);
	    this.getContentPane().setLayout(boxLayout);
	    
	    JLabel label1 = new JLabel("Label 1");
	    this.getContentPane().add(label1);
	    
	    getContentPane().add(Box.createRigidArea(new Dimension(0, 10)));
	    
	    JLabel label2 = new JLabel("Label 2");
	    this.getContentPane().add(label2);
	    
	    getContentPane().add(Box.createRigidArea(new Dimension(0, 10)));
	    
	    //Quelques actions sur les composants JLabel
	    JLabel label3 = new JLabel("Label 3");
	    label3.setHorizontalAlignment(SwingConstants.CENTER);
	    label3.setPreferredSize(new Dimension(90, 40));
	    label3.setBackground(Color.cyan);
	    label3.setOpaque(true);
	    label3.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
	    this.getContentPane().add(label3);
	    
	    getContentPane().add(Box.createRigidArea(new Dimension(0, 10)));
	    
	    JLabel label4 = new JLabel("Label 4");
	    label4.setPreferredSize(new Dimension(90, 40));
	    label4.setBackground(Color.orange);
	    label4.setOpaque(true);
	    label4.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
	    this.getContentPane().add(label4);	    
	    
	    getContentPane().add(Box.createRigidArea(new Dimension(0, 10)));
	    
	    JLabel label5 = new JLabel("Label 5");
	    label5.setHorizontalAlignment(SwingConstants.CENTER);
	    label5.setPreferredSize(new Dimension(90, 40));
	    label5.setBackground(Color.cyan);
	    label5.setOpaque(true);
	    label5.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
	    this.getContentPane().add(label5);
	    
	    getContentPane().add(Box.createRigidArea(new Dimension(0, 10)));
	    
	    JLabel label6 = new JLabel("Label 6");
	    label6.setPreferredSize(new Dimension(90, 40));
	    label6.setBackground(Color.orange);
	    label6.setOpaque(true);
	    label6.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
	    this.getContentPane().add(label6);
	    
	    
	    //Demander du texte à l'utilisateur
	    JTextField textField = new JTextField("Enter your email ...");
	    textField.setColumns(20);
	    textField.setBorder(BorderFactory.createTitledBorder("Email"));
	    textField.setCaretColor(Color.red);
	    textField.setHorizontalAlignment(JTextField.CENTER);
	    this.getContentPane().add(textField);
	    
	    JPasswordField passwordField = new JPasswordField("Enter your password ...");
	    passwordField.setColumns(20);
	    passwordField.setToolTipText("Enter your Password");
	    passwordField.setBorder(BorderFactory.createTitledBorder("Password"));
	    this.getContentPane().add(passwordField);
	}
}
