/*
   @ autor Luan Magalhães

    4) Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho, 
       sendo que cada elemento do vetor B deverá ser a raiz quadrada do respectivo elemento de A

 */
package listaexerciciosvetor;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");
        
        
        int vetorA [] = new int [15];
        
        double vetorB [] = new double [vetorA.length];
        
        
        for (int i = 0; i <vetorA.length; i++) {
            System.out.println("Informe os valores deste vetor, POSIÇÃO: " +(i+1));
            vetorA[i] = scan.nextInt();
        }
        
        for (int i = 0; i <vetorB.length; i++) {
            vetorB[i] = Math.sqrt(vetorA[i]);
        }
        
        System.out.println("");
        System.out.println("Valores do vetor B");
        
        for (double d : vetorB) {
            System.out.println(df.format(d));
        }
    }
}
