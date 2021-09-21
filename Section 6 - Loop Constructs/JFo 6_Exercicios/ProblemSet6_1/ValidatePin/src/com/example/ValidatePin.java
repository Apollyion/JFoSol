/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int pin = 9999; // Valor do pin para validação
        int input = 0;

        System.out.println("Insira o PIN:  ");
        input = sc.nextInt();
        
        while (input != pin) {
            System.out.println("O PIN inserido está incorreto, insira novamento: ");
            input = sc.nextInt();
        }

        System.out.println("O PIN inserio está correto, acesso liberado!");

        sc.close();
    }
}
