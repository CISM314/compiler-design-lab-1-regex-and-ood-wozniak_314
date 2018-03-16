
package cellnumberchecker;

/**
 *
 * @author LETLHOGONOLO
 */
import java.util.Scanner;

public class CellNumberChecker {

    private final Scanner scanner;

     public CellNumberChecker() {
        this.scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        CellNumberChecker call = new CellNumberChecker();
      

        call.GetGetUsername(true);
    }
    public void GetUsername(Boolean firstRun) {

        if(!firstRun) {
            System.out.println("WRONG!!!email Must match .co.za");
        } else {
            System.out.println("Please Enter the email ");
        }

        String numberInput = this.scanner.nextLine();

        Numberchecker usernameCheck = new Numberchecker(numberInput);

        if(usernameCheck.isValid()) {
            System.out.println("Correct Domain, " + numberInput + "!");
        } else {
            GetUsername(false);
        }
    
    }
}
