/*
    @author luanmagalhaes
    
    12) Criar um vetor A com 10 elementos inteiros. 
        Implementar um programa que defina e escreva a soma de todos os elementos armazenados neste vetor

 */
package listaexerciciosvetor;

import java.util.Scanner;


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
