/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailchecker;
import java.util.Scanner;
/**
 *
 * @author LETLHOGONOLO
 */
public class EmailChecker {
     Scanner scanner;

    public EmailChecker() {
        this.scanner = new Scanner(System.in);
    }

     

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         EmailChecker emailCode = new EmailChecker();

        emailCode.Getemail(true);
        
    /**
     *
     * @param firstRun
     */
    public void Getemail(Boolean firstRun) {

        if(!firstRun) {
            System.out.println("WRONG!!!email Must match .co.za");
        } else {
            System.out.println("Please Enter the email ");
        }

        String userInput = this.scanner.nextLine();

          DomainCheck email = new DomainCheck(userInput);

        if(email.isValid()) {
            System.out.println("Correct Domain, " + userInput + "!");
        } else {
            Getemail(false);
        // TODO code application logic here
    }
    
}

    
}