/*
 @author Luan Magalhães

 5)  Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho,
     sendo que cada elemento do vetor B deverá ser o respectivo elemento de A multiplicado por sua posição



 */
package listaexerciciosvetor;

import java.util.Scanner;


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
