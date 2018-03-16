/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Scanner;

public class App {

    Scanner scanner;

    public App() {
        this.scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        App app = new App();

        app.GetUsername(true);
    }

    public void GetUsername(Boolean firstRun) {

        if(!firstRun) {
            System.out.println("WRONG!!! in-valid numbers ");
        } else {
            System.out.println("Please Enter the valid cell numbers ");
        }

        String userInput = this.scanner.nextLine();

        UsernameCheck usernameCheck = new UsernameCheck(userInput);

        if(usernameCheck.isValid()) {
            System.out.println("Correct valid numbers , " + userInput + "!");
        } else {
            GetUsername(false);
        }
    }

}
