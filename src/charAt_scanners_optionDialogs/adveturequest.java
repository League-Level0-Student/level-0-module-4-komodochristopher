package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class adveturequest {
public static void main(String[] args) {
	
	
	
	

	
	 String adventure =JOptionPane.showInputDialog(null, "you wake up on a planet X 785 not knowing were you are a person walks up to you and says he is a human, do you trust him? Y or N");
	if(adventure.equals("Y")) {
	JOptionPane.showMessageDialog(null,"he kills you with a laser gun and reveals himself as an alien while you slowly die ");	
	System.exit(0);
	}
	if(adventure.equals("N")) {
		String m =JOptionPane.showInputDialog(null, "you run away but see an upcoming abandoned base that says power armour test site, Do you go there? Y or N");	 
		
		if(m.equals("N")) {
			JOptionPane.showMessageDialog(null, "you die from an alien beast");
			System.exit(0);
	}
	
		
		if(adventure.equals("Y")) {
		JOptionPane.showInputDialog(null,"you go into the base and see a full set of doom power armour, take it?  Y or N");	
		
		
	}
		if(adventure.equals("N")) {
			JOptionPane.showInputDialog(null,"You do not go into the base but instead wander in the jungle,you die type in you died in the textbox below");	
		}}
		if(adventure.equals("Y")) {
			
			JOptionPane.showInputDialog(null,"you take it and put it on luckily it has a radio on  , do you try to call someone?  Y or N");	
}
}
}
