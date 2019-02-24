
/*
@autor Luan Magalhães


1) Criar um vetor com 5 elementos inteiros. Construir um vetor B de mesmo
    tipo  e tamanho e com os "mesmos" elementos do vetor A

 */
package listaexerciciosvetor;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int vetorA[] = new int[5];
        int vetorB[] = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe os valores do vetor A, POSICAÇÃO: " + (1 + i));
            vetorA[i] = scan.nextInt();

        }

        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = vetorA[i];
        }

        System.out.println("");
        System.out.println("VALORES DO VETOR A");

        for (int vetorAa : vetorA) {
            System.out.println(vetorAa);
        }
        System.out.println("");
        System.out.println("VALORES DO VETOR B");

        for (int vetorBb : vetorB) {
            System.out.println(vetorBb);
        }

    }

}
