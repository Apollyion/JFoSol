/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalex;

import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class WatchMovie {

    public static void main(String args[]) {
        System.out.print("Enter the movie ticket price \n");
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();

        System.out.print("Enter the movie rating score \n");
        double ratingScore = sc.nextDouble();

        if( price >= 12 && ratingScore =5){
            System.out.println("I'am interested in watching the movie");
        } else {
            System.out.println("I'm not interested in watching the movie");
        }
        

    }
}
