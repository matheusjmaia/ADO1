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
public class Exercicio7 {
   
    static Scanner console = new Scanner (System.in); 
    static int alunos;

//funcção pede a quantidade de alunos e cria uma matriz
    static int[][] criaMatriz (){
        System.out.println("Insira a quantidade de alunos");
        alunos = console.nextInt();
        int alunosNotas[][] = new int[alunos][1];
        return alunosNotas;
    } 
    
    static int[][] pedeNotas (int[][] matriz){
       int v = 1;
        for (int i = 0;i<matriz.length ;i++){  
           for (int j = 0;j<matriz[i].length ;j++){
               System.out.println("Digite a nota de aluno "+v);
               matriz[i][j] = console.nextInt();
           }
       v = v+1;
        }
        return matriz;
    }
    
    static double calculaMedia (int[][] matriz){
        double todasNotas = 0;
        for (int i = 0;i<matriz.length ;i++){  
           for (int j = 0;j<matriz[i].length ;j++){
               todasNotas = todasNotas + matriz[i][j];
           }
    }
        double media = (todasNotas / alunos);
        return media;
        
    }

    public static void main(String[] args) {
        int [][] matriz = criaMatriz();
        matriz = pedeNotas(matriz);
        double media = calculaMedia(matriz);
        System.out.println("A média geral da sala é: "+media);
    }


}
