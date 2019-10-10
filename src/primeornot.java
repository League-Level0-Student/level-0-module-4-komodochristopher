import javax.swing.JOptionPane;

public class primeornot {
public static void main(String[] args) {
		String number = JOptionPane.showInputDialog(null, "type in a number to see if it is divisible");
		int one = Integer.parseInt(number);
	for( int i=2;i<one; i++) { 

	
		if(one%i==0) {
			JOptionPane.showMessageDialog(null,"is not prime");
			return;
			
		}
	}
	JOptionPane.showMessageDialog(null,"is prime");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}

