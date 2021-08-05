/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author anshenoy
 */
public class TestClass {

    public static void main(String args[]) {
        
        //Create an instance of ComputeMethods, 
        ComputeMethods cm = new ComputeMethods();

        //invoke the 3 methods and dispay their results

        System.out.println("Temp in Celsius is " + cm.fToC(100.0));
        System.out.println("Hypotenuse is " + cm.hypotenuse(7, 8));
        System.out.println("The sum of the dice valus is " + cm.roll());
    }
}
