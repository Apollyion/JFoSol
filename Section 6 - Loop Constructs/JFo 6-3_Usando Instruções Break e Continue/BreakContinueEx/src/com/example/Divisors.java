package com.example;

import java.util.Scanner;

public class Divisors {

    public static void main(String args[]) {

        
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Enter the number :  ");
        int num = sc.nextInt();
         
        System.out.print("Divisors of " + num+" "+ "="+" " );

        for (int i = 1; i <= num; i++) { // O numero de iterações é igual a num
            
            if (num % i != 0) { //Caso o resto da divisao não
                continue;       //seja zero, volta para o começo
            }

            System.out.print(i + " , "); // Caso seja divisor, imprime aqui
        }

        sc.close(); // Fechando o Scanner
    }
}
