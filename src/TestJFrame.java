import javax.swing.SwingUtilities;


public class TestJFrame {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				MyJFrameTP3 frame = new MyJFrameTP3();
				frame.setVisible(true);
			}
		});

	}

}
