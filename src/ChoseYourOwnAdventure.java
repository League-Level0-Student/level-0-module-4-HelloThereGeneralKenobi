import javax.swing.JOptionPane;

public class ChoseYourOwnAdventure {
	public static void main(String[] args) {
		int good = 0;
		int task = JOptionPane.showOptionDialog(null, "You are walking around and you see a dog poop bag on the ground, what do you do", "Why are you looking up here", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Pick it up", "Keep walking"}, null);
		if(task == 0) {
			good++;
		}
		int task1 = JOptionPane.showOptionDialog(null, "You are walking around and you see an old lady trying to cross the street, what do you do?", "Why are you looking up here", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Help her cross the street", "Keep walking"}, null);
		if(task1 ==0) {
			good++;
		}
		JOptionPane.showMessageDialog(null, "You were hit by a car and are being evaluated on where you will go in the afterlife.");
		if(good == 0) {
			JOptionPane.showMessageDialog(null, "You were a terrible person and will go to hell.");
		}
		else {
			JOptionPane.showMessageDialog(null, "You were a good person and will go to heaven.");
		}
	}
}
