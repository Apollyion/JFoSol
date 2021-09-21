package com.example;

import java.util.Scanner;

public class ComputeSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int input;

        System.out.println("Informe 10 numeros. \nInforme 0 para sair.");


        for(int i = 0; i <10; i++){
            input = sc.nextInt();
            if(input == 0){ 
                break;
            }

        sum += input;
        
        } // Fim loop for
        System.out.println("A soma do numeros informados é " + sum);
       sc.close();
        
    }
}
