
package ado1;

import java.util.Scanner;

/**
 *
 * @author matheus.jmaia
 */
public class Exerciciox10 {
     
    static double[][] populaMatriz (double [][] matriz){
        Scanner console = new Scanner(System.in);
        for (int i = 0;i<matriz.length;i++){
            for (int j = 0;j<matriz[i].length;j++){
                System.out.println("Insira um valor para essa váriavel da matriz: ");
                matriz[i][j] = console.nextInt();
            }
        }
        return matriz;
    }
    
    static double soma (double [][] matriz1,double [][] matriz2){
        double soma = 0;
        for (int i = 0;i<matriz1.length;i++){
            for (int j = 0;j<matriz1[i].length;j++){
                soma =  soma + (matriz1[i][j] + matriz2[i][j]);
            }
    }
        return soma;
    }
    
    public static void main(String[] args) {
        double matriz1[][] = new double [2][2];
        double matriz2[][] = new double [2][2];
        matriz1 = populaMatriz(matriz1);
        System.out.println("Agora vamos popular a segunda matriz...");
        matriz2 = populaMatriz(matriz2);
        double soma =soma(matriz1, matriz2);
        System.out.println("A soma dos dados dessas matriz é: "+soma);
    }
    
}
