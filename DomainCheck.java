/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailchecker;
import java.util.regex.*;


/**
 *
 * @author LETLHOGONOLO
 */
class DomainCheck {
     String email;

    public DomainCheck(String email) {
        this.email = email;
    }

    public Boolean isValid() {
        return this.email.matches("\\.[a-zA-Z]{2}+\\.[a-zA-Z]{2}");
    }
}
