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
public class Exercico9 {

    static Scanner console = new Scanner(System.in);
    static String segunda[] = new String[2];
    static String terça[] = new String[2];
    static String quarta[] = new String[2];
    static String quinta[] = new String[2];
    static String sexta[] = new String[2];

    static void pedeAulas() {
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    System.out.println("Digite as aulas da segunda separado por um enter: ");
                    segunda[0] = console.next();
                    segunda[1] = console.next();
                case 1:
                    System.out.println("Digite as aulas da terça separado por um enter: ");
                    terça[0] = console.next();
                    terça[1] = console.next();
                case 2:
                    System.out.println("Digite as aulas da quarta separado por um enter: ");
                    quarta[0] = console.next();
                    quarta[1] = console.next();
                case 3:
                    System.out.println("Digite as aulas da quinta separado por um enter: ");
                    quinta[0] = console.next();
                    quinta[1] = console.next();
                case 4:
                    System.out.println("Digite as aulas da sexta separado por um enter: ");
                    sexta[0] = console.next();
                    sexta[1] = console.next();
            }

        }

    }

    static void mostraAulas(String[][] agenda) {
        System.out.println("Digite o dia a ser consultado");
        String dia = console.next();
        dia = dia.toLowerCase();
        switch (dia) {
            case "segunda":
                System.out.println("As suas aulas nesse dia são: ");
                System.out.println(segunda[0]);
                System.out.println(sesgunda[1]);
            case "terça":
                System.out.println("As suas aulas nesse dia são: ");
                System.out.println(terça[0]);
                System.out.println(terça[1]);
            case "quarta":
                System.out.println("As suas aulas nesse dia são: ");
                System.out.println(quarta[0]);
                System.out.println(quarta[1]);
            case "quinta":
                System.out.println("As suas aulas nesse dia são: ");
                System.out.println(quinta[0]);
                System.out.println(quinta[1]);
            case "sexta":
                System.out.println("As suas aulas nesse dia são: ");
                System.out.println(sexta[0]);
                System.out.println(sexta[1]);

        }
    }

}
