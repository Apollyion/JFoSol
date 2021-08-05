/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class ColorRange {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a color code: ");
        double value;
        value = sc.nextDouble();
        
        if (value >= 380 && value <450){
            System.out.println("The color is Violet");
        } else if (value >= 450 && value <495){
            System.out.println("The color is Blue");
        } else if (value >= 495 && value < 570){
            System.out.println("The color is Green");
        } else if (value >= 570 && value <590){
            System.out.println("The color is Yellow");
        } else if (value >= 590 && value < 620){
            System.out.println("The color is Orange");
        } else if (value >= 620 && value < 750){
            System.out.println("The color is Red");
        } else {
            System.out.println("The entered wavelength is not a part of the visible spectrum");
        }

        sc.close();

    }
}
