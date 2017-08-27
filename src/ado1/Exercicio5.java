package ado1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author matheus.jmaia
 */
public class Exercicio5 {

    //função sorteia um número aleatorio de 0 a 99 e retorna o mesmo
    static int sorteiaNumero() {
        Random rng = new Random();
        int numeroAleatorio = rng.nextInt(99);
        return numeroAleatorio;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Adivinhe o número que a 'maquina' está pensando!");
        System.out.println("digite 'desistir' caso queria sair");
        int numeroSorteio = sorteiaNumero(); boolean condicao = true;
        try{
        do {
            System.out.println("Insira um número: ");
            int numeroUser = console.nextInt();
            if (numeroUser == numeroSorteio){
                System.out.println("você acertou!");
                condicao = false;
            }else{
                System.out.println("errou, tente novamente");
            }
        }while (condicao);
        }catch (java.util.InputMismatchException e){
            System.out.println("O número que a maquina estava pensando era: "+ numeroSorteio);
            System.out.println("Até mais");
        }
        
    
    
    }
}
