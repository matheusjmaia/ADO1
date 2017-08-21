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
public class Exercicio3 {

    //Funcão ler um número de tipo int, e retorna o mesmo
    static int lerNumero() {
        Scanner console = new Scanner(System.in);
        System.out.print("Digite um número: ");
        return console.nextInt();
    }

    //função exiber por extenso o numero digitado
    static void extenso0a9(int numero) {
        switch (numero) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("UM");
                break;
            case 2:
                System.out.println("DOIS");
                break;
            case 3:
                System.out.println("TRÊS");
                break;
            case 4:
                System.out.println("QUATRO");
                break;
            case 5:
                System.out.println("CINCO");
                break;
            case 6:
                System.out.println("SEIS");
                break;
            case 7:
                System.out.println("SETE");
                break;
            case 8:
                System.out.println("OITO");
                break;
            case 9:
                System.out.println("NOVE");
                break;

        }
    }
    //função principal verifica se o numero pertece ao conuto de 0 á 9
    public static void main(String[] args) {
        int numero = lerNumero();
        if (!(numero >= 0 && numero <= 9)){
            System.out.println("número invalido fofo.");
        }else {
            extenso0a9(numero);
        }
    }
}
