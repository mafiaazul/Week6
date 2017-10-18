import javax.swing.JOptionPane;

public class RPSRocha {

	public static void main(String[] args) {
		
		final String[] shapes = {"rock", "paper", "scissors"};
				
		String playerHand = JOptionPane.showInputDialog(null, "Please type in your hand (rock or paper or scissors)", "RPS Game!");
		
		String computerHand = shapes[(int)(Math.random() * shapes.length)];
		
		JOptionPane.showConfirmDialog(null, "my message", "tests", JOptionPane.CANCEL_OPTION);
		
		
		JOptionPane.showMessageDialog(null,
		        "Problem writing to backup directory",
		        "Backup problem",
		        JOptionPane.INFORMATION_MESSAGE);
	}

}
