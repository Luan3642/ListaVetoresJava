/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexerciciosvetor;

import java.util.Scanner;

/**
 *
 * @author Luan
 */
public class Ex17 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int vetorA[] = new int[10];
        int superior = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe a " + (1 + i)  +"º "+ " Idade");
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] > 35) {
                superior += 1;
            }
        }
        
        System.out.println("");
        System.out.println("Pessoas com idade superior a 35: " +superior + " Pessoas");
    }
}
