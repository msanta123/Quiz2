package payment;
import java.util.stream.*;
public class Purchase {
	private double carCost;
	private double downPayment;
	private double monthsOnLoan;
	private double interestRate;
	
	public Purchase(double carCost, double downPayment, double monthsOnLoan, double interestRate){
		this.carCost = carCost;
		this.downPayment = downPayment;
		this.monthsOnLoan = monthsOnLoan;
		this.interestRate = interestRate;
	}
	
	public static void main(String args[]) {
		Purchase myPurchase = new Purchase(80000, 40000, 24, 0.15);
		double m = myPurchase.totalInterest();
		double n = myPurchase.monthlyPayment();
		System.out.println(m + "\n" + n);
		
	}
	
	public double monthlyPayment() {
		double owed = carCost - downPayment;
		double r = Math.pow((1 + (interestRate/12)), monthsOnLoan);
		double compoundedInterest = ((interestRate/12) * r) / (r - 1);
		double monthlyPayment = owed * compoundedInterest;
		double monthlyPaymentRounded = Math.round(monthlyPayment * 100.0) / 100.0;
		return monthlyPaymentRounded;
	}
	public double totalInterest() {
		double owed = carCost - downPayment;
		double r = Math.pow((1 + (interestRate/12)), monthsOnLoan);
		double compoundedInterest = ((interestRate/12) * r) / (r - 1);
		double monthlyPayment = owed * compoundedInterest;
		double basePayment = owed / monthsOnLoan;
		double interestPerMonth = monthlyPayment - basePayment;
		double totalInterest = interestPerMonth * monthsOnLoan;
		double totalInterestRounded = Math.round(totalInterest * 100.0) / 100.0;
		return totalInterestRounded;
	}
}
