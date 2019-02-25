
/*
 @ autor Luan Magalhães

   13) Criar um vetor A com 10 elementos inteiros. 
       Implementar um programa que determine a soma dos elementos armazenados neste vetor que são múltiplos de 5.

*/



package listaexerciciosvetor;

import java.util.Scanner;


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
