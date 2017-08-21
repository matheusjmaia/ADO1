/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ado1;

import java.util.Scanner;

/**
 *
 * @author matheus.jmaia
 */
public class Exercicio4 {
    //função lê cinco números e armazena num vetor
    static double[] lerNumeros() {
        Scanner console = new Scanner(System.in);
        double vetor[] = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = console.nextDouble();
        }
        return vetor;
    }
    //calcule a média aritmética
    static double calculaMedia (double [] vetor){
        double media = 0;
        for (int i = 0; i < 5; i++) {
            media = media + vetor [i]; 
        }
    return media/5;
    }
    
    //função exibe mensagens de acordo com o criterio da media
    static void resultadoMedia (double media){
        if (media<5){
            System.out.println("Floppou, shashay away!");
        }
        if (media>=5 && media <9){
            System.out.println("Passou mana");
        }
        if (media >=9 && media <10){
            System.out.println("Sambou viado");
        }
        if (media == 10){
            System.out.println("Bicha a senhora é destruidora mesmo hein viado!");
        }
    }
    public static void main(String[] args) {
       double [] vetor = lerNumeros();
       double media = calculaMedia(vetor);
       resultadoMedia(media);
        System.out.print("Sua média é: "+media);
    }
}
