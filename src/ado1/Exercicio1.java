
package ado1;

import java.util.Scanner;

/**
 *
 * @author matheus.jmaia
 */
public class Exercicio1 {

    /*
    Funcão ler um número de tipo double, e retorna o mesmo
    */
    static double lerNumero (){
        Scanner console = new Scanner (System.in);
        System.out.print("Digite um número: ");
        return console.nextDouble();
    }
    /*
    Função recebe um número por parâmetro e verifica se ele é maior o igual a 50,0
    caso seja, retorna SUCESSO, se não retorna ERRO
    */
    static String verifica (double numero){
        if (numero >= 50.0){
            return "SUCESSO";
        }else {
            return "ERRO";
        }
    }
    public static void main(String[] args) {
         double numero = lerNumero();
         String resultado = verifica(numero);
         System.out.println(resultado);
         System.out.println("FIM DO PROGAMA");
         
        
    }
            
}
