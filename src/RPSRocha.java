import javax.swing.JOptionPane;

public class RPSRocha {

	public static void main(String[] args) {
		
<<<<<<< HEAD
		final String[] ValidAnswers = {"Rock", "Paper", "Scissors"};
		
		String userChoise = JOptionPane.showInputDialog(null, "Please enter rock or paper or scissors");
		
		String computerHand = ValidAnswers[(int)(Math.random() * ValidAnswers.length)];
		
		JOptionPane.showMessageDialog(computerHand, "This is the computer pick");

=======
		final String[] shapes = {"rock", "paper", "scissors"};
				
		String playerHand = JOptionPane.showInputDialog(null, "Please type in your hand (rock or paper or scissors)", "RPS Game!");
		
		String computerHand = shapes[(int)(Math.random() * shapes.length)];
		
		JOptionPane.showConfirmDialog(null, "my message", "tests", JOptionPane.CANCEL_OPTION);
		
		
		JOptionPane.showMessageDialog(null,
		        "Problem writing to backup directory",
		        "Backup problem",
		        JOptionPane.INFORMATION_MESSAGE);
>>>>>>> 84dd4d7ae005e2aa5f1a83cc396ea17faa845e2e
	}

}
