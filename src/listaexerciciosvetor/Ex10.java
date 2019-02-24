/*
 @author luanmagalhaes

 10) Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, 
     sendo que cada elemento do vetor B deverá ser o resto da divisão do respectivo elemento de A por 2 (dois)

 */
package listaexerciciosvetor;

import java.util.Scanner;


public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int vetorA [] = new int [5];
        
        int vetorB[] = new int [vetorA.length];
        
        
        for (int i = 0; i <vetorA.length; i++) {
            System.out.println("Informe os valores do vetor A, POSIÇÃO: " + (1+i));
            vetorA[i] = scan.nextInt();
        }
        
        for (int i = 0; i <vetorA.length; i++) {
           vetorB[i] = vetorA[i] %2;
        }
        
        System.out.println("");
        System.out.println("Valores de B");
        for (int w : vetorB) {
            System.out.println(w);
        }
    }
}
