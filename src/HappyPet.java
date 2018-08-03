import javax.swing.JOptionPane;

public class HappyPet {
	
	static // 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String petname = JOptionPane.showInputDialog("What pet do you want?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			
			
			for(int i = 0; happinessLevel < 5; i=i) {
				int task = JOptionPane.showOptionDialog(null, "What do you want to make your pet happy?", "Happiness", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Walk", "Pet", "Feed" }, null);
			if(task == 2) {
				feed();
				happinessLevel++;
			}
			else if(task == 1) {
				pet();
				happinessLevel++;
			}
			else if(task == 0) {
				walk();
				happinessLevel++;
			}

			}
			JOptionPane.showMessageDialog(null, "Your pet is happy!");
			
			
			
			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	
	static void walk() {
		JOptionPane.showMessageDialog(null, "Your pet is happy after his walk!");
	}
	static void pet() {
		JOptionPane.showMessageDialog(null, "Your pet is happy after you pet him!");
	}
	static void feed() {
		JOptionPane.showMessageDialog(null, "Your pet is happy after his meal!");
	}
}