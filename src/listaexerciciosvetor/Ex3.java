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
public class Ex3 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       int vetorA [] = new int [15];
       
       int vetorB [] = new int [15];
       
        for (int i = 0; i <vetorA.length; i++) {
            System.out.println("Informe os valores do vetor: " + (1+i));
            vetorA[i] = scan.nextInt();
        }
        
        for (int i = 0; i <vetorB.length; i++) {
            vetorB[i] = vetorA[i] * vetorA[i];
        }
        
        System.out.println("");
        System.out.println("VETOR B");
        
        for(int demonstraValor :vetorB){
            System.out.println(demonstraValor);
        }
    }
}
