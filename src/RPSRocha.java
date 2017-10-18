import javax.swing.JOptionPane;

public class RPSRocha {

	public static void main(String[] args) {

		String computerHand = "";

		String playerHand = JOptionPane.showInputDialog(null, "Please type in your hand (rock or paper or scissors)");

		int randomPick = (int) (Math.random() * 3);

		switch (randomPick) {
		case 0:
			computerHand = "rock";
			break;
		case 1:
			computerHand = "paper";
			break;
		case 2:
			computerHand = "scissors";
			break;

		}

		JOptionPane.showMessageDialog(null, "Your hand: " + playerHand + "\n" + "Computer's Hand: " + computerHand);

		if (playerHand.equalsIgnoreCase(computerHand)) {
			JOptionPane.showMessageDialog(null,
					"You picked " + playerHand + " and the computer also picked " + computerHand + ". It was a tie!");

		} else if (playerHand.equalsIgnoreCase("rock")) {
			if (computerHand.equals("paper"))
				JOptionPane.showMessageDialog(null, "Paper eats rock. You lose!!");
			else
				JOptionPane.showMessageDialog(null, "Rock crushes scissors. You win!!");
		} else if (playerHand.equalsIgnoreCase("paper")) {
			if (computerHand.equals("scissors"))
				JOptionPane.showMessageDialog(null, "Scissor cuts paper. You lose!!");
			else
				JOptionPane.showMessageDialog(null, "Paper eats rock. You win!!");
		} else if (playerHand.equalsIgnoreCase("scissors")) {
			if (computerHand.equals("rock"))
				JOptionPane.showMessageDialog(null, "Rock breaks scissors. You lose!!");
			else
				JOptionPane.showMessageDialog(null, "Scissor cuts paper. You win!!");
		}

	}

}
