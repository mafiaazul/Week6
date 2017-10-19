import java.util.Scanner;

/*
 * Author: Rodrigo Rocha
 * Desciptrion: Program that returns the EF rating based on the three second wind gust entered by the user.
 * Error checking:
 * 		- Gust less than 65
 *  	- Any negative numbers
 *		- Any input that is not a sequence of numbers 
 *	
 */
public class EFScaleRocha {

	public static void main(String[] args) {

		final int NO_WIND_GUST = 0;
		final int BELOW_MIN_EF = 65;
		final int EF_0_MAX = 85;
		final int EF_1_MAX = 110;
		final int EF_2_MAX = 135;
		final int EF_3_MAX = 165;
		final int EF_4_MAX = 200; 
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a 3 second wind gust (MPH) greater or equal 65: ");
		
		if (in.hasNextInt()) {
			
			int windGust = in.nextInt();
			
			if (windGust < NO_WIND_GUST)
				System.out.println("You entered a negative number!");
			else if (windGust < BELOW_MIN_EF)
				System.out.println("You entered a number less than 65!");
			else if (windGust <= EF_0_MAX)
				System.out.println("EF Rating = 0");
			else if (windGust <= EF_1_MAX)
				System.out.println("EF Rating = 1");
			else if (windGust <= EF_2_MAX)
				System.out.println("EF Rating = 2");
			else if (windGust <= EF_3_MAX)
				System.out.println("EF Rating = 3");
			else if (windGust <= EF_4_MAX)
				System.out.println("EF Rating = 4");
			else 
				System.out.println("EF Rating = 5");
		} else
			System.out.println("You didn't enter a number or you entered a number that's not an integer");
			
		in.close();
	}

}
