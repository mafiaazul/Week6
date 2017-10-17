import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class TaxBracketRocha {

	public static void main(String[] args) {
		
		final int LOW_FED_BRACKET = 9325;
		final int MID_LOW_FED_BRACKET = 37950;
		final int MID_FED_BRACKET = 191650;
		final int MID_HIGH_FED_BRACKET = 418399;
		
		final double LOW_FED_TAX_RATE = 10;
		final double MID_LOW_FED_TAX_RATE = 15;
		final double MID_FED_TAX_RATE = 25;
		final double MID_HIGH_FED_TAX_RATE = 33;
		final double HIGH_FED_TAX_RATE = 39.60;

		final int LOW_STATE_BRACKET = 1554;
		final int MID_LOW_STATE_BRACKET = 6215;
		final int MID_STATE_BRACKET = 13895;
		final int MID_HIGH_STATE_BRACKET = 31080;
		final int HIGH_STATE_BRACKET = 69929;
		
		final double LOW_STATE_TAX_RATE = 0.36;
		final double MID_LOW_STATE_TAX_RATE = 2.43;
		final double MID_STATE_TAX_RATE = 4.5;
		final double MID_HIGH_STATE_TAX_RATE = 6.8;
		final double HIGH_STATE_TAX_RATE = 7.92;
		final double VERY_HIGH_STATE_TAX_RATE = 8.98;
		
		double finalFederalTaxBracket = 0;
		double finalStateTaxBracket = 0;
		
		int income = Integer.parseInt(JOptionPane.showInputDialog("Please enter your income"));
		
		if (income <= LOW_FED_BRACKET)
			finalFederalTaxBracket = LOW_FED_TAX_RATE;
		else if (income <= MID_LOW_FED_BRACKET)
			finalFederalTaxBracket = MID_LOW_FED_TAX_RATE;
		else if (income <= MID_FED_BRACKET)
			finalFederalTaxBracket = MID_FED_TAX_RATE;
		else if (income <= MID_HIGH_FED_BRACKET)
			finalFederalTaxBracket = MID_HIGH_FED_TAX_RATE;
		else
			finalFederalTaxBracket = HIGH_FED_TAX_RATE;
		
		if (income <= LOW_STATE_BRACKET)
			finalStateTaxBracket = LOW_STATE_TAX_RATE;
		else if (income <= MID_LOW_STATE_BRACKET)
			finalStateTaxBracket = MID_LOW_STATE_TAX_RATE;
		else if (income <= MID_STATE_BRACKET)
			finalStateTaxBracket = MID_STATE_TAX_RATE;
		else if (income <= MID_HIGH_STATE_BRACKET)
			finalStateTaxBracket = MID_HIGH_STATE_TAX_RATE;
		else if (income <= HIGH_STATE_BRACKET)
			finalStateTaxBracket = HIGH_STATE_TAX_RATE;
		else
			finalStateTaxBracket = VERY_HIGH_STATE_TAX_RATE;
		
		int totalFederalDiscount = (int)(income * finalFederalTaxBracket) / 100;
		int totalStateDiscount = (int)(income * finalStateTaxBracket) / 100;
		
		DecimalFormat df = new DecimalFormat();
		df.setGroupingSize(3);
		
		JOptionPane.showMessageDialog(null, "---- Your tax bil ----\n" +
										   "Your income: $" + df.format(income) + "\n" +
										   "Your federal tax rate: " + finalFederalTaxBracket + "%\n" +
										   "Your federal tax: $" + df.format(totalFederalDiscount) + "\n" +
										   "**************\n" +
										   "Your state tax rate: " + finalStateTaxBracket + "%\n" +
										   "Your state tax: $" + df.format(totalStateDiscount), "Your PayStub",
										   JOptionPane.INFORMATION_MESSAGE);
			
	}

}
