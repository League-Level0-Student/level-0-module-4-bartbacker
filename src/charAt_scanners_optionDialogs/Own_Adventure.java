package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class Own_Adventure {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "The treasure was stolen from ur house! You need to get it back!");
		String player = JOptionPane.showInputDialog("What is ur character's name");
		
		int task =0;
		int orc=1;
		int tower = 1;
		while(task!=1 && orc!=0 && tower==1){
		task = JOptionPane.showOptionDialog(null, player + " wants treasure back, what u do?", player, 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "start adventure", "NOTHING" }, null);
		if (task == 1) { 
		nothing(player);
		}
		if(task == 0) {
			go(player);
			JOptionPane.showMessageDialog(null, "U found a sword lying on the ground! (not realistic but ok)");
			orc = JOptionPane.showOptionDialog(null, player + " sees a pack of big orcs escorting the treasure thieves, what u do?", player, 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "charge at orcs!", "throw sword at orcs!" }, null);
			if(orc == 0) {
				charge(player);
				
			}
			if(orc == 1) {
				thro(player);
				JOptionPane.showMessageDialog(null, "U see the thieves enter a tower and follow them");
				tower = JOptionPane.showOptionDialog(null, player + " finds the treasure next to a sleeping dragon, what u do?", player, 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "charge at dragon!", "eat the dragon!", "just take the treasure very quietly" }, null);
			}
			if(tower == 0) {
				charge2(player);
			}
			if(tower == 1) {
				eat(player);
				JOptionPane.showMessageDialog(null, player + " celebrated with a party and was happy");
			}
			if(tower == 2) {
				take(player);
			}
		}
		
	
		}
	
			
		}
		
	
		
		
	
	public static void nothing( String player ) {
		JOptionPane.showMessageDialog(null, player + " says goodbye to treasure");
	}
	public static void go( String player ) {
		JOptionPane.showMessageDialog(null, player + " kicks down door and runs toward the treasure!");
	}
	public static void charge( String player ) {
		JOptionPane.showMessageDialog(null, player + " is super weak and gets pounded to the ground by orcs");
	}
	public static void thro( String player ) {
		JOptionPane.showMessageDialog(null, player + " misses and hits a bush which cause the orcs to go check out noise");
	}
	public static void charge2( String player ) {
		JOptionPane.showMessageDialog(null, player + " gets rolled over on by the sleeping dragon");
	}public static void eat( String player ) {
		JOptionPane.showMessageDialog(null, player + " ATE THE DRAGON AND TOOK THE TREASURE HOME!");
	}public static void take( String player ) {
		JOptionPane.showMessageDialog(null, player + " stubbed toe on rock, screamed, and was then eaten by dragon");
	}
	
}