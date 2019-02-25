/*

   @author Luan Magalhães  

   20) Faça um programa de consulta pela posição numérica da pessoa: leia nomes de pessoas, sendo a quantidade determinada pelo usuário. 
       Logo após a entrada pergunte ao usuário o número do nome que ele gostaria de consultar. Após sua resposta, exiba o nome que fica na posição informada.
 */
package listaexerciciosvetor;


import java.util.Scanner;

/**
 *
 * 
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
