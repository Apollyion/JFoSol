/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um numero para descobrir seus multiplos:  ");
        int input = sc.nextInt();

        for(int i = 1; i <= 12 ; i++) {
            System.out.println("O multiplo de " + input + " por "+ i + " é: " + input*i);
        }

        sc.close();
    }

}
