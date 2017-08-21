/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ado1;

import java.util.Scanner;

public class Exercicio2 {
//função verifica se um número é impar ou par e retorna um string
   static String verificarImparOuPar (double numero){
       if (numero%2==0){
           return "Esse número é PAR;";
       }else {
           return "Esse número é IMPAR;";
       }
   } 
   
// funcão verifica se o número é primo e retorna o resultado em string
   static String verificaPrimo (double numero){
       int contador = 0;
       for(int i = 1; i <= numero; i++){
          if (numero%i==0){
            contador = contador = contador + 1;
            if (contador == 2){
                return "Esse número é PRIMO.";
            }
          } 
       }
    return "Esse número não é primo.";   
   }
   
    public static void main(String[] args) {
        try{
        Scanner console = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double numero = console.nextDouble();
        String imparOuPar = verificarImparOuPar(numero);
        String primoOunao = verificaPrimo(numero);
        System.out.println(imparOuPar);
        System.out.println(primoOunao);
        }catch (java.util.InputMismatchException e) {
	    System.out.println("Ops..! o dado digitado não é um número!");
	        }

    }

}
