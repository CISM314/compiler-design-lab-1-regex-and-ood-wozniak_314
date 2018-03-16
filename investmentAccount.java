package bankaccountapp;
import java.util.Scanner;


public class InvestmentAccount {
    private  double investmentAmount;
    private double years;
    private double annualInterestRate;
   private double futureinvestmentValue;
   {
    public   calculateInvestmentValue(){
           
    Scanner input = new Scanner(System.in);

    System.out.print("Enter investment amount: ");
    double investmentAmount = input.nextDouble();

    System.out.print("Enter annual interest rate in percentage: ");
    double annualInterestRate = input.nextDouble() / 100;

    System.out.print("Enter number of years: ");
    double years = input.nextDouble();

    input.close();

    double futureInvestmentValue = calculateFutureInvestment(
            investmentAmount, annualInterestRate, years);

    System.out.print("Accumulated value is $" + futureInvestmentValue);
   }
    

private static double calculateFutureInvestment(double investmentAmount,
        double annualInterestRate, double years) {
    double futureInvestmentValue = investmentAmount
            * Math.pow((1 + (annualInterestRate / 12)), (years * 12));
    return futureInvestmentValue;
    
    
}

}

