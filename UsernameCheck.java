/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.regex.*;

public class UsernameCheck {

    String usernamecellno;

    public UsernameCheck(String usernamecellno) {
        this.usernamecellno = usernamecellno;
    }

    public Boolean isValid() {
        return this.usernamecellno.matches("[0-9]{10}");
    }
}