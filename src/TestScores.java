import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		String ans = JOptionPane.showInputDialog("What did you get on the test?");
		double urmom = Double.parseDouble(ans);
		if(urmom > 89.9) {
			JOptionPane.showMessageDialog(null, "Wow you'r a nerd.");
		}
		else if(urmom > 70 && urmom < 90) {
			JOptionPane.showMessageDialog(null, "Hopefully your parents aren't Asian.");
		}
		else if(urmom < 50) {
			JOptionPane.showMessageDialog(null, "Dang you suck.");
		}
	}
}
