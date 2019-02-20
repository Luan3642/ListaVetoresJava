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
public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int vetorA [] = new int [10];
        
        int vetorB [] = new int [vetorA.length];
        
        for (int i = 0; i <vetorA.length; i++) {
            System.out.println("Informe os valores do vetor A, POSICAÇÃO: " +(1+i) );
            vetorA[i] = scan.nextInt(); 
        }
        
        for (int i = 0; i <vetorA.length; i++) {
            vetorB[i] = vetorA[i] * i;
        }
        
        System.out.println("");
        System.out.println("Valores do vetor B");
        
        for(int amostra : vetorB){
            System.out.println(amostra);
        }
        
        
    }
}
