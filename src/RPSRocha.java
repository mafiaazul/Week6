import javax.swing.JOptionPane;

public class RPSRocha {

	public static void main(String[] args) {
		
		final String[] ValidAnswers = {"Rock", "Paper", "Scissors"};
		
		String userChoise = JOptionPane.showInputDialog(null, "Please enter rock or paper or scissors");
		
		String computerHand = ValidAnswers[(int)(Math.random() * ValidAnswers.length)];
		
		JOptionPane.showMessageDialog(computerHand, "This is the computer pick");

	}

}
