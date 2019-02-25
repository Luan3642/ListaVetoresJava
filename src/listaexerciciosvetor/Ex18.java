/*

    @author Luan Magalhães

    18) Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas. 
        Escreva um programa que determine e escreva a menor e a maior idades e suas respectivas posições.


*/
package listaexerciciosvetor;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * 
 */
public class Ex18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Random rd = new Random();
        
        int vetorA [] = new int [10]; 
        
        
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        
        int posicaoMenor = 0;
        int posicaoMaior = 0;
        
        
        int vetorPosicaoMaior [] = new int [10];
        int vetorPosicaoMenor [] = new int [10];
        
        for (int i = 0; i <vetorA.length; i++) {
            System.out.println("Digite a " +(i+1) + " idade" );
            vetorA[i] = scan.nextInt();
        }
        
        for (int i = 0; i <vetorA.length; i++) {
            if (vetorA[i] >= maior  ){
                maior = vetorA[i];
                posicaoMaior = i;
                
            } else if (vetorA [i] < menor){
                menor = vetorA[i];
                posicaoMenor = i;
            }
        }
        System.out.println("");
        System.out.println("Maior idade: " +maior);
        System.out.println("Posicação: " +posicaoMaior);
        
        
        System.out.println("");
        System.out.println("");
        System.out.println("Menor idade: " +menor );
        System.out.println("Posição: " +posicaoMenor);
    }
            
}
