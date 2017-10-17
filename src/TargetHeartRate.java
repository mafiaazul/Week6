import java.util.Scanner;

public class TargetHeartRate {

	public static void main(String[] args) {  
		
		final double BOTTOM_HEART_RATE = 0.55;
		final double TOP_HEART_RATE = 0.65;
		final int MAX_HEART_RATE = 220;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter your age: ");
		int age = in.nextInt();
		
		System.out.println();
		int maxHeartRatebyAge = MAX_HEART_RATE - age;
		System.out.println("Your Max Heart Rate: " + maxHeartRatebyAge + " bpm");
		System.out.println();
		System.out.println("Your Target Heart Rate is: " + (int)(maxHeartRatebyAge * BOTTOM_HEART_RATE) + "-" + 
							(int)(maxHeartRatebyAge * TOP_HEART_RATE) + " bpm");
		
		in.close();
	}

}
