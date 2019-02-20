/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexerciciosvetor;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Luan
 */
public class Ex7 {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        
        Random rd = new Random();
        
        DecimalFormat df = new DecimalFormat("#0.00");
        
        
        int vetorA [] = new int [10];
        
        int vetorB [] = new int [vetorA.length];
        
        int vetorC [] = new int [10];
        
        
        for(int i = 0; i <vetorA.length; i++){
            System.out.println("Informe os valores do vetor de A, POSICAÇÃO: " +(1+i));
            vetorA[i] = scan.nextInt();
        }
        
        System.out.println("");
        
        for (int i = 0; i <vetorB.length; i++) {
            System.out.println("Informe os valore do vetor B, POSICAÇÃO: " +(1+i));
            vetorB[i] = scan.nextInt();
        }
        
        for (int i = 0; i <vetorA.length; i++) {
            vetorC[i] = vetorA[i] - vetorB[i];
        }
        
        System.out.println("");
        System.out.println("Valores do vetor C ");
        
        for (int i : vetorC) {
            System.out.println(i);
        }
    }
}
