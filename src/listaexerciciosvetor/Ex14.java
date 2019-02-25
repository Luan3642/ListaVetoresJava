/*
 
   @autor Luan Magalhães

    14) Criar um vetor A com 10 elementos inteiros. 
        Implementar um programa que defina e escreva a média aritmética simples dos elementos ímpares armazenados neste vetor.



 */
package listaexerciciosvetor;

import java.util.Scanner;


public class Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int vetorA [] = new int [10];
        int soma = 0;
        int divisao = 0;
        int media = 0;
        
        for (int i = 0; i <vetorA.length; i++) {
            System.out.println("Informe os valores do vetor A, POSIÇÃO: " +(1+i));
            vetorA[i] = scan.nextInt();
        }
        
        for (int i = 0; i <vetorA.length; i++) {
            if (vetorA[i] % 2 == 1 ){
                divisao += 1;
                soma += vetorA[i];
                media = soma / divisao;
            }
            
            
            
        }
        System.out.println("Média: " +media);
        
    }
    
}
