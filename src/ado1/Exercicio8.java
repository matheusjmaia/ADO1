/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ado1;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Exercicio8 {
    static Scanner console = new Scanner (System.in); 
    
    static double[] pedeNumeros (double [] vetor){
         for (int i = 0;i<vetor.length ;i++){
             System.out.print("Digite um numero: ");
             vetor [i] = console.nextDouble();
         }
    return vetor;
    }
    
    static double verificaMenorNumero (double [] vetor){
        double menorNumero = vetor [0];
        for (int i = 0;i<vetor.length ;i++){
            if(vetor[i]<menorNumero)
                menorNumero = vetor[i];
        }
    return menorNumero;
    }
    
    public static void main(String[] args) {
        System.out.println("Digite o números a ser digitado nessa rodada");
        int n = console.nextInt();
        double vetor [] = new double [n];
        vetor = pedeNumeros(vetor);
        double menor = verificaMenorNumero(vetor);
        System.out.println("O menor número é: "+menor);
    }
    
    
    
}
