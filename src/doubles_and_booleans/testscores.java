package doubles_and_booleans;

import javax.swing.JOptionPane;

public class testscores {
	public static void main(String[] args) {
		String score = JOptionPane.showInputDialog("What was your test score");
		double total = Double.valueOf(score);
		if (total < 70) {
			JOptionPane.showMessageDialog(null, "did you study?");

		}

		else {
			JOptionPane.showMessageDialog(null,"wow! awesome score!");
		}
	}
}
