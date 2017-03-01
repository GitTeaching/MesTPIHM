package org.ihm.tp9;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class TestJFrameTP9 {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Message Informatif", "Information", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Message Préventif", "Attention", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Message d'Erreur", "Erreur", JOptionPane.ERROR_MESSAGE);
	
		int rep = JOptionPane.showConfirmDialog(null, "Voulez vous créer et afficher une fenetre MyJFrame ?", "Bonjour", JOptionPane.YES_NO_OPTION);
		if (rep == JOptionPane.YES_OPTION)
			SwingUtilities.invokeLater(new Runnable(){
				public void run(){
					MyJFrameTP9 frame = new MyJFrameTP9();
					frame.setVisible(true);
				}
			});
		
		JOptionPane.showInputDialog(null, "Quel est votre album préféré ?", "Deezer", JOptionPane.QUESTION_MESSAGE);
		
		String[] bands = {"Iron Maiden", "Dream Theater", "Opeth"};
		String s = (String) JOptionPane.showInputDialog(null, "Choisisser le groupe à écouter", "Sélection groupe", JOptionPane.QUESTION_MESSAGE, null, bands, bands[0]);
		if(s!=null)
			System.out.print(s);
	}

}
