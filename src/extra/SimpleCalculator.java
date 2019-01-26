package extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
for(int i = 0; i < 5;i++) {
		// 1. Get 2 numbers from the user and convert them to integer.
		String number = JOptionPane.showInputDialog("first number? ");
		int num1 = Integer.parseInt(number);
		String number2 = JOptionPane.showInputDialog("second number?");
		int num2 = Integer.parseInt(number2);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, num1 + " & "+ num2 + " = ?", "Calculadora", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "+", "-", "*", "/" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
		if(operation == 0) {
			add(num1, num2);
		}
		if(operation == 1) {
			sub(num1, num2);
		}
		if(operation == 2) {
			multi(num1, num2);
		}
		if(operation == 3) {
			divid(num1, num2);
		}
}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
public static void add(int num1, int num2) {
	JOptionPane.showMessageDialog(null, num1 + num2);
}
public static void sub(int num1, int num2) {
	JOptionPane.showMessageDialog(null, num1 - num2);
}
public static void multi(int num1, int num2) {
	JOptionPane.showMessageDialog(null, num1 * num2);
}
public static void divid(int num1, int num2) {
	JOptionPane.showMessageDialog(null, num1 / num2);
}
	// 4. Create similar methods for subtraction, multiplication and division.
}