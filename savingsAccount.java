
package bankaccountapp;


public class SavingsAccount extends BankAccount{
    
    
    private double interestRate;
public SavingsAccount(double rate, String accountName){
    interestRate = rate;
}
public void addInterest(){
    double interest = getbalance() * interestRate/100;
    deposite(interest);
}
}