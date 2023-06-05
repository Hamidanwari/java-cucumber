package FalconCucumberFrameWork.CucumberFrame;

import java.text.DecimalFormat;

public class BillCalculater {

	
	public static double CalculateBillForCustomers(double billAmount , double taxRate) {
		
		double FinalBillAmount = billAmount * (1 + taxRate / 100);
		
		DecimalFormat df = new DecimalFormat ("0.00");
		String result = df.format(FinalBillAmount); 
		
		return Double.parseDouble(result);
		
	}
}
