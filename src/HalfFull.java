import java.util.Scanner;

public class HalfFull {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter a number from 1 to 100: ");
		int number = in.nextInt();
		
		String message = "";
		
		if (number < 50)
			message = "Your glass is half empty.";
		else
			message = "Your glass is half full.";
		
		System.out.println(message);
		System.out.println();
		
		String message2 = "Your glass is half empty";
		
		if (number >= 50)
			message2 = ("Your glass is half full");
		
		System.out.println(message2);
		
		in.close();
		
	}

}
