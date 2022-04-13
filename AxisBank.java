package week3.day1;

public class AxisBank extends BankInfo {
	
	@Override
public void deposit() {
		
		System.out.println("Axix Bank deposit overrided");
	}
	
	public static void main(String[] args) {
		
		AxisBank axis = new AxisBank();
		axis.saving();
		axis.fixed();
		axis.deposit();
	}

	
	
}
