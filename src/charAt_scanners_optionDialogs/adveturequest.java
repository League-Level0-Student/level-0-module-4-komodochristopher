package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class adveturequest {
	public static void main(String[] args) {

		String adventure = JOptionPane.showInputDialog(null,
				"you wake up on a planet X 785 not knowing were you are,a person walks up to you and says he is a human, do you trust him? Y or N");
		if (adventure.equals("Y")) {
			JOptionPane.showMessageDialog(null,
					"he kills you with a laser gun and reveals himself as an alien while you slowly die ");
			System.exit(0);
		}
		if (adventure.equals("N")) {
			String m = JOptionPane.showInputDialog(null,
					"you run away but see an upcoming abandoned base that says power armour test site, Do you go there? Y or N");

			if (m.equals("N")) {
				JOptionPane.showMessageDialog(null, "you die from an alien beast");
				System.exit(0);
			}

			if (m.equals("Y")) {
				String Z = JOptionPane.showInputDialog(null,
						"you go into the base and see a full set of doom power armour, take it?  Y or N");
				if (Z.equals("N")) {
					JOptionPane.showInputDialog(null,
							"You do not take the power armour but instead wander in the jungle,you die type in you died in the textbox below");
				}
				if (Z.equals("Y")) {

					JOptionPane.showMessageDialog(null,
							 "you take it and put it on luckily it has a radio on ,so you use that to call someone to pick you up, the perosn replies in a language you undertsand you see a drp ship arriving in the sky. You walk toward the ship landing all the humans come and greet you and also strangely look at you because you are covered in armour, you have escaped the planet atmosphere and begun a long journey home.YOOOOOOOOOOOOOOOOOU WIIIIIIIIIIIIN    ");
					
				}
			
			}
			

		}

	}
}
