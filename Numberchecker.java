
package cellnumberchecker;

/**
 *
 * @author LETLHOGONOLO
 */
public class Numberchecker {
    String num;
    public Numberchecker(String number){
         this.num = number;
    }
    public Boolean isValid() {
        return this.num.matches("[0-9]{10}");
    }
    
}
    

