
public class Destinations {

	public static void main(String[] args) {
		int zipcode = 02703;
		int destination = 100; // default destination
		
		switch (zipcode) {
		case 02703:
		case 02035:
			destination = 1;
			break;
		case 93710:
		case 93720:
			destination = 2;
			break;
		default:
			destination = 0;
			break;

		}
		System.out.println(destination);
	}

}
