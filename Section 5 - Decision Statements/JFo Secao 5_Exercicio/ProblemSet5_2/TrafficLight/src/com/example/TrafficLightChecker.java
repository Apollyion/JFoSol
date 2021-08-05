/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.*;

public class TrafficLightChecker {

    public static void main(String args[]) {
      
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a color code: ");
        int currentColor = sc.nextInt();

        //IF statements
        
        if (currentColor == 1){
            System.out.println(" Next Traffic Light is Green");
        } else if (currentColor == 2){
            System.out.println(" Next Traffic Light is Yellow");
        } else if (currentColor == 3){
            System.out.println(" Next Traffic Light is Red");
        } else {
            System.out.println("Invalid Color");
        }

        sc.close();
    }

}
