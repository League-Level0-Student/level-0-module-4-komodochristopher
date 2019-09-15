package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
 String pet =  JOptionPane.showInputDialog(null, "What kind of pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for( int i=1;i<10; i++) {
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "what do you want to do to make your pet happy", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "food", "toy", "water" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			System.out.println(task);
			if(task ==2) {
				water();
				
			}
			if(task==0)
				food();
			if(task==1) {
				toy();
			}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			if(happinessLevel > 9) {
				break;
			}
			}
		}


	static // 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	void food() { 
	JOptionPane.showMessageDialog(null, "your pet gobbles down the food an looks at you lovingly");	
	 happinessLevel = happinessLevel + 1;
	 
	
	}
	static void water() {
		JOptionPane.showMessageDialog(null, "your pet drinks the water and accidently bites you in the hand");	
		happinessLevel = happinessLevel -1;
		
	}
	static void toy() {
	JOptionPane.showMessageDialog(null, "your pet chokes on the toy and gets ANGRY at you and kills you");	
	
	happinessLevel = happinessLevel -1;
	}
	
	
	}
