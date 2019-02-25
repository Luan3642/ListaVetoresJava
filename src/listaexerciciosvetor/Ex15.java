/*

    @autor Luan Magalhães

    15) Criar um vetor A com 10 elementos inteiros. 
        Desenvolver um programa que defina o percentual de elementos pares e ímpares, 
        respectivamente, armazenados neste vetor.

*/

package listaexerciciosvetor;

import java.util.Scanner;


public class Ex15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        int valorVetor = 10;
        int vetorA[] = new int[valorVetor];
        int porcentagemPar = 0;
        int porcentagemImpar = 0;
        int par = 0;
        int impar = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe os valores do vetor A, POSIÇÃO: " + (1 + i));
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                par += 1;
                porcentagemPar = (par * 100) / valorVetor;
            } else if (vetorA[i] % 2 == 1){
                impar +=1;
                porcentagemImpar = (impar * 100) / valorVetor;
            }
        }
        
        System.out.println("Pares: " + "% " +porcentagemPar);
        System.out.println("Impares: "+ "% "+porcentagemImpar);
    }
}
