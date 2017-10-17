import java.util.Scanner;

public class SimpleSwitch {

	public static void main(String[] args) {

		String message = "You selected a number outside of the rhyme.";

		Scanner in = new Scanner(System.in);

		System.out.print("Enter an integer number: ");
		int number = in.nextInt();

		switch (number) {
		case 1:
		case 2:
			message = "Buckle my shoe";
			break;
		case 3:
		case 4:
			message = "Shut the door";
			break;
		case 5:
		case 6:
			message = "Pick up the sticks";
			break;
		case 7:
		case 8:
			message = "Shut the gate";
			break;
		case 9:
		case 10:
			message = "Do it again";
			break;
		default:
			message = "error";

		}

		System.out.println(message);

		in.close();
	}

}
