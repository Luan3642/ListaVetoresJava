/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexerciciosvetor;


import java.util.Scanner;

/**
 *
 * @author Luan
 */
public class Ex20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe quantas pessoas deseja ler");
        int numeroPessoas = scan.nextInt();
        
        System.out.println("");
        String vetor [] = new String [numeroPessoas];
        int vetorConsulta [] = new int [numeroPessoas];
        
        for (int i = 0; i <vetor.length; i++) {
            System.out.println("Informe o nome das pessoas");
            vetor[i] = scan.next();
            vetorConsulta[i] = i +1;
        }
        
        System.out.println("");
        
        System.out.println("Informe a posicação da pessoa que deseja consultar.");
        int numeroConsulta = scan.nextInt();
        
        System.out.println("");
        for (int i = 0; i <vetor.length; i++) {
            if (numeroConsulta == vetorConsulta[i]){
                System.out.println(vetor[i]);
            }
        }
        
    }
}
