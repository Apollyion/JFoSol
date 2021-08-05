/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processingname;

import java.util.Scanner;


public class ProcessName {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");

        // your code goes here
        
        String nomeComp = sc.nextLine();

        int localEsp = nomeComp.indexOf(" ");

        String sobreNome = nomeComp.substring(localEsp, nomeComp.length());
        System.out.println("Your name is: "+ sobreNome + ", " + nomeComp.charAt(0) + ".");

        sc.close();
    }
}