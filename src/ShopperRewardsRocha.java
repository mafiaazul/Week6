import java.util.Scanner;

public class ShopperRewardsRocha {

	public static void main(String[] args) {

		double coupon = 0;
		int couponRate = 0;
		int gasCouponDiscount = 0;
		
		final int HUNDRED_DIVIDER = 100;
		
		final int LOW_GROCERY_PURCHASE_RANGE = 10;
		final int MEDIUM_GROCERY_PURCHASE_RANGE = 60;
		final int HIGH_GROCERY_PURCHASE_RANGE = 150;
		final int VERY_HIGH_GROCERY_PURCHASE_RANGE = 210;
		
		final int LOW_GROCERY_DISCOUNT_RATE = 8;
		final int MEDIUM_GROCERY_DISCOUNT_RATE = 10;
		final int HIGH_GROCERY_DISCOUNT_RATE = 12;
		final int VERY_HIGH_GROCERY_DISCOUNT_RATE = 14;
		
		final int GAS_PURCHASE_MIN = 1;
		final int GAS_PURCHASE_LOW_DISCOUNT_CAP = 49;
		final int GAS_PURCHASE_MEDIUM_DISCOUNT_CAP = 99;
		final int GAS_LOW_DISCOUNT_RATE = 1;
		final int GAS_MEDIUM_DISCOUNT_RATE = 2;
		final int GAS_HIGH_DISCOUNT_RATE = 3;

		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter the cost of your groceries: ");
		double groceryCost = in.nextDouble();
		
		if (groceryCost > VERY_HIGH_GROCERY_PURCHASE_RANGE) {
			coupon = (groceryCost * VERY_HIGH_GROCERY_DISCOUNT_RATE) / HUNDRED_DIVIDER;
			couponRate = VERY_HIGH_GROCERY_DISCOUNT_RATE;
		}
		else if (groceryCost > HIGH_GROCERY_PURCHASE_RANGE) {
			coupon = (groceryCost * HIGH_GROCERY_DISCOUNT_RATE) / HUNDRED_DIVIDER;
			couponRate = HIGH_GROCERY_DISCOUNT_RATE;
		}
		else if (groceryCost > MEDIUM_GROCERY_PURCHASE_RANGE) {
			coupon = (groceryCost * MEDIUM_GROCERY_DISCOUNT_RATE) / HUNDRED_DIVIDER;
			couponRate = MEDIUM_GROCERY_DISCOUNT_RATE;
		}
		else if (groceryCost > LOW_GROCERY_PURCHASE_RANGE) {
			coupon = (groceryCost * LOW_GROCERY_DISCOUNT_RATE) / HUNDRED_DIVIDER;
			couponRate = LOW_GROCERY_DISCOUNT_RATE;
		}
		
		if (groceryCost >= GAS_PURCHASE_MIN) {
			if (groceryCost <= GAS_PURCHASE_LOW_DISCOUNT_CAP)
				gasCouponDiscount = GAS_LOW_DISCOUNT_RATE;
			else if (groceryCost <= GAS_PURCHASE_MEDIUM_DISCOUNT_CAP) 
				gasCouponDiscount = GAS_MEDIUM_DISCOUNT_RATE;
			else
				gasCouponDiscount = GAS_HIGH_DISCOUNT_RATE;
		}
		
		System.out.printf("You receive a discount coupon of $%.2f. (%%%d of your purchase)", coupon, couponRate);
		System.out.println();
		System.out.printf("You have earned a %d¢ discount per gallon of gas.", gasCouponDiscount);
		
		in.close();
	}

}
