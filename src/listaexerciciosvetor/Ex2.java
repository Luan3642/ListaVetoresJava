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
public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int vetorA [] = new int [8];
        
        int vetorB [] = new int [8];
        
        for (int i = 0; i <vetorA.length; i++) {
            System.out.println("Informe os valores deste vetor, POSIÇÃO: " +(1+i));
            vetorA[i] = scan.nextInt();
        }
        
        for (int i = 0; i <vetorB.length; i++) {
            vetorB[i] = vetorA[i] *2;
        }
        System.out.println("");
        System.out.println("VETOR B");
        
        
        for (int valor : vetorB){
            System.out.println(valor );
        }
    }
}
