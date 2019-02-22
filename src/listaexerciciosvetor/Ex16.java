/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexerciciosvetor;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Luan
 */
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
