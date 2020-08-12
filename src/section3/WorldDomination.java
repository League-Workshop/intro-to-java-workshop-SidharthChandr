package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		String x=JOptionPane.showInputDialog("Do You Know How to Code?");
		if(x.equalsIgnoreCase("yes")){
			JOptionPane.showMessageDialog(null, "You shall rule the world");
		}
		else {
			JOptionPane.showMessageDialog(null, "Good Luck Washing the Dishes");
		}
		// 1. Ask the user if they know how to write code.

		// 2. If they say "yes", tell them they will rule the world.

		// 3. Otherwise, wish them good luck washing dishes.

	}
}

