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
public class Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int vetorA [] = new int[5];
        int somaVetor = 0;
        
        
        for (int i = 0; i <vetorA.length; i++) {
            System.out.println("Informe os números deste vetor, POSIÇÃO: " +(1+i));
            vetorA[i] = scan.nextInt();
        }
        
        for (int i = 0; i <vetorA.length; i++) {
            somaVetor += vetorA[i];
        }
        
        System.out.println("");
        System.out.println("Soma do vetor: " +somaVetor);
    }
}
