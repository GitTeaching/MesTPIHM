package org.ihm.tp7;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MyJFrameTp7 extends JFrame {
	
	JLabel displayItem;
	JLabel displayFonts;
	JLabel sbar;
	
	JList<String> listeFonts;
	
	public MyJFrameTp7 () {
		super();
		initJFrame();
	}
	
	private void initJFrame() {
		this.setSize(500, 400);
		this.setTitle("JList & JScrollPane");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panel = new JPanel();
		
		//JComboBox
	    displayItem = new JLabel("Select your choice : ");
	    panel.add(displayItem);	    
		String itemListeBox [] = {"Facebook", "Twitter", "Instagram"};
		JComboBox<String> listeBox = new JComboBox<String>(itemListeBox);
		listeBox.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					displayItem.setText(e.getItem().toString());
				}
			}
			
		});
		panel.add(listeBox);
		
		//JList
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		String itemListeFonts [] = ge.getAvailableFontFamilyNames();
		
		listeFonts = new JList<String>(itemListeFonts);
		listeFonts.setLayoutOrientation(JList.VERTICAL_WRAP);
		
		JScrollPane spane = new JScrollPane(listeFonts);
		spane.setPreferredSize(new Dimension(250, 180));
		
		displayFonts = new JLabel("Fonts");
		
		panel.add(displayFonts);
		listeFonts.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				if(!e.getValueIsAdjusting()) {
					String name = (String) listeFonts.getSelectedValue();
					Font font = new Font(name, Font.PLAIN, 12);
					displayFonts.setText(name);
					displayFonts.setFont(font);
				}			
			}
		});
		panel.add(spane);
	
		
		this.setContentPane(panel);
		
	}


}
