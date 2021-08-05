
package com.example;
import java.util.*;

public class TrafficLightSwitch {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a color code: ");
        int currentColor = sc.nextInt();

        //Switch case statements
        
        switch (currentColor) {
            case 1: 
            System.out.println(" Next Traffic Light is Green");
            break;
            case 2:
            System.out.println(" Next Traffic Light is Yellow");
            break;
            case 3:
            System.out.println(" Next Traffic Light is Red");
            break;
            default:
            System.out.println("Invalid Color");
            break;
        }

        sc.close();
       
    }

}
