package bankaccountapp;
import java.util.Scanner;
/**
 *
 * @author BUHLE
 */
public class BankAccount {
    private String accountName;
    private double balance;
    private double deposite;
    private double withdraw;
public void setAccountName(String accountName){
    this.accountName = accountName;
}
public String getAccountName(){
    return accountName;
}
public void setBalance(double balance){
    this.balance = balance;
} 
public double getbalance(){
    return balance;
}
public void setDeposite(double deposite){
    this.deposite = deposite;
   
}
public double getDeposite(){
    return deposite;
   
}
public double setWithdraw(double withdraw){
    this.withdraw = withdraw;
    return withdraw;
}
public boolean deposite(double amount){
    if (amount > 0){
        balance = balance + amount;
        return true;
    }
    else {
        return false;
    }
}
public boolean withdraw(double amount){
    if (amount > balance){
        return false;
    }
    else{
        return true;
    }
}


    
    
    public static void main(String[] args) {
        BankAccount call = new BankAccount();
        call .deposite();
        call.getSavingsAccount();
        call.getInvestmentAccount();
        call.getCheckingAccount();
       
        
    
        
    }
    
}
