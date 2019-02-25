/*

    @author Luan

    16).Criar um vetor A com 10 elementos inteiros. Escrever um programa que calcule e escreva: a) a soma de elementos armazenados neste vetor que são inferiores a 15; 
        b) a quantidade de elementos armazenados no vetor que são iguais a 15;  
        c) a média dos elementos armazenados no vetor que são superiores a 15. 

 */
package listaexerciciosvetor;

import java.text.DecimalFormat;
import java.util.Scanner;



public class Ex16 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int somaInferioresQuinze = 0;
        int iguaisQuinze = 0;
        int valorVetor = 10;
        int somaMedia = 0;
        double media = 0;
        
        
        DecimalFormat df = new DecimalFormat("#0.00");
        
        int vetorA[] = new int[valorVetor];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe os valores do vetor A, POSIÇÃO: " + (1 + i));
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] < 15) {
                somaInferioresQuinze += vetorA[i];
            } else if (vetorA[i] == 15) {
                iguaisQuinze += 1;
            }
            else if (vetorA[i]> 15){
                somaMedia += vetorA[i];
                media = somaMedia /valorVetor;
            }
        }
        System.out.println("");
        System.out.println("Soma dos elementos inferiores a 15: " +somaInferioresQuinze);
        System.out.println("Iguais a 15: " +iguaisQuinze);
        System.out.println("Média do elementos maiores que 15: " + df.format(media));

    }
}
