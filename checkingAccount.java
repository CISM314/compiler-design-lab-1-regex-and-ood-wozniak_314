
package bankaccountapp;


public class CheckingAccount extends BankAccount{
    private int transactionCount;
    private static final int NUM_FREE = 3;
    private static final double TRANS_FEE = 2.0;

public CheckingAccount(String accountName){
    transactionCount = 0;

    
}
public boolean deposite(double amount){
    if(super.deposite(amount) ){
        transactionCount++;
        return true;
    }
    return false;
   }
public boolean withdraw(double amount){
    if(super.withdraw(amount)){
        transactionCount++;
        return true;
    }
    return false;
    }
public void deductFees(){
    if(transactionCount > NUM_FREE ){
        double fees = TRANS_FEE* (transactionCount - NUM_FREE);
        if (super.withdraw(fees)) {
            transactionCount = 0;
        }
        
    }
}
}
    
