/*
  @author Luan Magalhães
  
  6) Criar dois vetores A e B cada um com 10 elementos inteiros. 
     Construir um vetor C, onde cada elemento de C é a soma dos respectivos elementos em A e B


 */
package listaexerciciosvetor;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        DecimalFormat df = new DecimalFormat("#0,00");
        
        
        int vetorA [] = new int [10];
        
        int vetorB [] = new int [vetorA.length];
        
        int vetorC [] = new int [10];
        
        for (int i = 0; i <vetorA.length; i++) {
            System.out.println("Informe os valores do vetor A, POSICAÇÃO: "+(1+i) );
            vetorA[i] = scan.nextInt();
        }
        
        System.out.println("");
        for (int i = 0; i <vetorB.length; i++) {
            System.out.println("Informe os valores do vetorB, POSICAÇÃO: " +(1+i));
            vetorB[i] = scan.nextInt();
        }
        
        for (int i = 0; i <vetorA.length; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
        }
        
        System.out.println("");
        System.out.println("Valores do vetor C");
        
        for(int amostra :vetorC){
            System.out.println(amostra);
        }
    }
}
