package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String pet = JOptionPane.showInputDialog("what pet do u want?");
		int happinessLevel = 0;
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for(int i = 0; i < 3; i++) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, pet + " want happiness! what u do?", pet, 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Eat pet", "Groom pet", "Give pet money", "Look at pet" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if(task == 0) {
				JOptionPane.showMessageDialog(null, pet + " likes it");
				System.out.println(happinessLevel = 1);	
			}
			else if(task == 1) {
				JOptionPane.showMessageDialog(null, pet + " loves it");
				System.out.println(happinessLevel = 3);		
			}
			else if(task == 2) {
				JOptionPane.showMessageDialog(null, pet + " very happy");
				System.out.println(happinessLevel = 50);	
			}
			else if(task == 3) {
				JOptionPane.showMessageDialog(null, pet + " hates it! Terrible human");
				System.out.println(happinessLevel = -10000);		
		}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			if(happinessLevel >= 50) {
				break;
			}
		}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
 
}