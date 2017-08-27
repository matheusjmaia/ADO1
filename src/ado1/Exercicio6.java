/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ado1;

/**
 *
 * @author mathe
 */
public class Exercicio6 {
    //função popula a tabuada de a cordo com as multiplicações
    static int[][] tabuada1a9 (int [][]tabuada){
        for (int i = 1; i< tabuada.length; i++){
            for (int j = 1; j< tabuada[i].length; j++){
                tabuada [i][j] = i*j;
            }
        }
        return tabuada;
    }
    
    static void imprimeTabuada (int[][] tabuada){
        System.out.println(" * |  1  2  3  4  5  6  7  8  9\n" +
                           "-------------------------------");
        for (int i = 1; i< tabuada.length; i++){
            for (int j = 1; j< tabuada[i].length; j++){
                System.out.println(" "+i+" | "+tabuada[i][j]+" "+tabuada[i][j]+" "+tabuada[i][j]+" "+tabuada[i][j]+" "+tabuada[i][j]+" "+tabuada[i][j]+" "+tabuada[i][j]+" "+tabuada[i][j]+" "+tabuada[i][j]+" ");
            }
    }
    }
    
    public static void main(String[] args) {
        //cria matriz
        int tabuada[][] = new int[9][9];
        tabuada = tabuada1a9(tabuada);
        imprimeTabuada(tabuada);
        
        
    }
}
