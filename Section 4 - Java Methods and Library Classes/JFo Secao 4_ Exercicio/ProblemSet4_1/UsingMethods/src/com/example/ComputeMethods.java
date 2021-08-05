/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Random;
import java.lang.Math;

public class ComputeMethods {
    
    Random rand = new Random();

    public double fToC(double degreesF){
        return (5/9.0 * (degreesF -32));
 
    }
    public double hypotenuse(int a, int b){
        return  (Math.sqrt((a * a) + (b * b)));
         
    }
    public int roll(){
        return ((rand.nextInt(7)+1) + (rand.nextInt(7)+1));
    } 
}

