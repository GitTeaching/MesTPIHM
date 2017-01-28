package org.ihm.tp8;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MyJFrameTP8 extends JFrame{
	
	public MyJFrameTP8 () {
		super();
		initMyJFrame();
	}

	private void initMyJFrame() {
		this.setSize(500, 450);
		this.setTitle("JFrame - TP8");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane jtp = new JTabbedPane();
		jtp.setPreferredSize(new Dimension(350, 250));
		jtp.addTab("JLabel", new LabelPanel());
		jtp.addTab("JTextArea", new TextAreaPanel());
		jtp.addTab("JTextPane", new TextPanePanel());
		this.getContentPane().add(jtp);
	}
	
	private class LabelPanel extends JPanel{
		
		private JLabel label;
		private JSlider slider;
		private JProgressBar progBar;
		private JButton startBtn;
		private Timer timer;

		public LabelPanel() {
			label=new JLabel("Label");
			label.setFont(new Font("Serif", Font.ITALIC, 18));
			this.add(label);
			
			slider = new JSlider (0, 100, 30);
			slider.setMinorTickSpacing(10);
			slider.setMajorTickSpacing(20);
			slider.setPaintTicks(true);
			slider.setPaintLabels(true);
			slider.addChangeListener(new ChangeListener(){

				@Override
				public void stateChanged(ChangeEvent e) {
					int value = slider.getValue();
					label.setText(Integer.toString(value));				
				}			
			});
			this.add(slider);
			
			progBar = new JProgressBar();
			progBar.setMinimum(0);
			progBar.setMaximum(100);
			progBar.setStringPainted(true);
			this.add(progBar);		
			
			startBtn = new JButton("Start");
			startBtn.addActionListener(new ClickAction());
			this.add(startBtn);
			
			timer = new Timer(50, new UpdateBarListener());
			
		}
		
		private class ClickAction extends AbstractAction{
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (timer.isRunning()) {
					timer.stop();
					startBtn.setText("Start");
				}
				else if(!"End".equals(startBtn.getText())){
					timer.start();
					startBtn.setText("Stop");
				}			
			}		
		}
		
		private class UpdateBarListener implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {	
				
				int val = progBar.getValue();
				
				if (val >= 100) {
					timer.stop();
					startBtn.setText("End");
				}
				else
					progBar.setValue(++val);
			}		
		}
	}
		
	private class TextAreaPanel extends JPanel{
		public TextAreaPanel() {
			JTextArea textArea = new JTextArea("Type some text ..", 10, 30);
			textArea.setLineWrap(true);
			textArea.setWrapStyleWord(true);
			textArea.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
			this.add(textArea);
			
			JScrollPane scroll = new JScrollPane(textArea);
			this.add(scroll);
		}	
	}

	private class TextPanePanel extends JPanel{
		public TextPanePanel() { 
			this.setLayout(new BorderLayout());
			
			JTextPane textPane = new JTextPane();
			textPane.setContentType("text/html");
			textPane.setEditable(false);
			textPane.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
			this.add(textPane, BorderLayout.NORTH);
			
			JScrollPane scroll = new JScrollPane(textPane);
			this.add(scroll);
			
			try {
				String cd = System.getProperty("user.dir") + "\\src\\org\\ihm\\tp8\\";
				textPane.setPage("File:///" + cd + "test.html");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			
		}
    }

}
