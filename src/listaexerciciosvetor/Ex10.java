/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexerciciosvetor;

import java.util.Scanner;

/**
 *
 * @author luanmagalhaes
 */
public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int vetorA [] = new int [5];
        
        int vetorB[] = new int [vetorA.length];
        
        
        for (int i = 0; i <vetorA.length; i++) {
            System.out.println("Informe os valores do vetor A, POSIÇÃO: " + (1+i));
            vetorA[i] = scan.nextInt();
        }
        
        for (int i = 0; i <vetorA.length; i++) {
           vetorB[i] = vetorA[i] %2;
        }
        
        System.out.println("");
        System.out.println("Valores de B");
        for (int w : vetorB) {
            System.out.println(w);
        }
    }
}
