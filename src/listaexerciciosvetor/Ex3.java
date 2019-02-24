/*
   @ autor Luan Magalhães
    
    3) Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, 
       sendo que cada elemento do vetor B, deverá ser o quadrado do respectivo elemento A.


 */
package listaexerciciosvetor;

import java.util.Scanner;



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
