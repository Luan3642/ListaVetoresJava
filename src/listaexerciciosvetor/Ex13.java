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
public class Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int vetorA [] = new int [10];
        int cont = 0;
        
        
        for (int i = 0; i <vetorA.length; i++) {
            System.out.println("Informe os valores do vetor, POSIÇÃO: " +(1+i));
            vetorA[i] = scan.nextInt();
        }
        
        for (int i = 0; i <vetorA.length; i++) {
            if (vetorA[i] % 5 ==0){
                cont += 1;
            }
        }
        System.out.println("Total de números multiplos de 5: " +cont);
        
    }
}
