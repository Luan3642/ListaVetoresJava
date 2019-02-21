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
public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int vetorA [] = new int [5];
        int par = 0;
        int impar = 0;
        for (int i = 0; i <vetorA.length; i++) {
            System.out.println("Informe os valores do vetor A, POSIÇÃO: " +(1+i));
            vetorA[i] = scan.nextInt();
        }
        
        for (int i = 0; i <vetorA.length; i++) {
            if (vetorA[i] % 2 ==0){
                 par += 1;
            }else {
                 impar += 1;
            }
        }
        System.out.println("");
        System.out.println("Quantidade de pares: " +par);
        System.out.println("Quantidade de impares: "+impar);
        
    }
    
}
