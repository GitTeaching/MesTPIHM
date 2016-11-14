package org.ihm.tp5;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

public class MyJFrameTP5 extends JFrame{
	
	private JLabel statusBar;
	private JSpinner spinner;
	private JCheckBox activeBox;
	private int count = 0;
	private JLabel activeLabel;

	public MyJFrameTP5 (){
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
		
		statusBar = new JLabel("0");
		statusBar.setBorder(BorderFactory.createEtchedBorder());
		panel.add(statusBar);
		
		JButton addButton = new JButton("+");
		addButton.addActionListener(new ButtonListener1());
		addButton.addActionListener(new ButtonListener2());
		panel.add(addButton);
		
		SpinnerModel numModel = new SpinnerNumberModel(0, -100, 100, 1);
		spinner = new JSpinner(numModel);
		panel.add(spinner);
		
		activeBox = new JCheckBox("Activer/Désactiver");
		activeBox.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (activeBox.isSelected())
					activeLabel.setText("activeBox Checked");
				else
					activeLabel.setText("activeBox Unchecked");
			}
			
		});
		panel.add(activeBox);
		
		activeLabel = new JLabel("activeBox Unchecked");
		activeLabel.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				activeLabel.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				activeLabel.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
			}
			
		});
		panel.add(activeLabel);
	}
	
	private class ButtonListener1 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			statusBar.setText(Integer.toString(++count));
		}
	}
	
	private class ButtonListener2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Integer val = (Integer) spinner.getValue();
			spinner.setValue(++val);
		}
		
	}
}
