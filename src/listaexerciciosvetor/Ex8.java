/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexerciciosvetor;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author luanmagalhaes
 */
public class Ex8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#0.00");

        int vetorA[] = new int[10];

        int vetorB[] = new int[vetorA.length];

        int vetorC[] = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe os valores do vetor A, POSIÇÃO: " + (1 + i));
            vetorA[i] = scan.nextInt();
        }

        System.out.println("");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Informe os valores do vetor B, POSIÇÃO: " + (1 + i));
            vetorB[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] * vetorB[i];
        }

        System.out.println("");
        System.out.println("Valor do vetor de C ");

        for (int mostraVetor : vetorC) {
            System.out.println(mostraVetor);
        }
    }
}
