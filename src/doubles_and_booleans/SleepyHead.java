package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday=false;
		boolean isVacation=false;

		/* You MUST use the above boolean variables in your code */

		int stick;

// int choice = ;

		/*
		 * Ask the user for these values using a confirm dialog like the one below
		 * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head",
		 * JOptionPane.YES_NO_OPTION);
		 */
		int regular = JOptionPane.showConfirmDialog(null, "Is it a weekday? ", "Sleepy head",
				JOptionPane.YES_NO_OPTION);
		if (regular == 1) {
			isWeekday = false;
		}
		if (regular == 0) {
			isWeekday = true;
		}
		System.out.println(regular);

		int Vacation = JOptionPane.showConfirmDialog(null, "are you on vacation?","Sleepy head",JOptionPane.YES_NO_OPTION);
		if (Vacation == 1) {

			isVacation = false;

		}
		if(Vacation == 0) {
		isVacation = true;	
		}

		/*
		 * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday,
		 * 
		 * print “get up lazy bones!�? If it is a weekday, and we are on vacation, print
		 * “sleep in�?.
		*/
		if(isVacation || !isWeekday ||(isWeekday && isVacation)) {
			JOptionPane.showMessageDialog(null, "sleep in!");
		
		}
		else if (isWeekday) {
		JOptionPane.showMessageDialog(null,"get up Lazy bones!!");
		}
	}
	
}
