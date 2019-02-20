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
 * @author Luan
 */
public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");
        
        
        int vetorA [] = new int [15];
        
        double vetorB [] = new double [vetorA.length];
        
        
        for (int i = 0; i <vetorA.length; i++) {
            System.out.println("Informe os valores deste vetor, POSIÇÃO: " +(i+1));
            vetorA[i] = scan.nextInt();
        }
        
        for (int i = 0; i <vetorB.length; i++) {
            vetorB[i] = Math.sqrt(vetorA[i]);
        }
        
        System.out.println("");
        System.out.println("Valores do vetor B");
        
        for (double d : vetorB) {
            System.out.println(df.format(d));
        }
    }
}
