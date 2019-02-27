/*
    @author Luan Magalhães 

    21) Faça um programa de consulta de telefones a partir de um nome informado por uma chave de dados: leia nomes de pessoas com seus respectivos telefones, 
        sendo a quantidade determinada pelo usuário. Em seguida pergunte ao usuário qual o nome que ele deseja consultar o telefone. 
        Após sua resposta, exiba o telefone da pessoa procurada.

 */
package listaexerciciosvetor;

import java.util.Scanner;


public class Ex21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Informe quantos nomes deseja ler");
        int quantidadeNomes = scan.nextInt();
        
        System.out.println("");
        String nomes [] = new String [quantidadeNomes];
        
        int telefonePessoas [] = new int [quantidadeNomes];
        String nomeDeseja;
        
        for (int i = 0; i <nomes.length; i++) {
            System.out.println("Informe o nome das pessoas");
            nomes[i] = scan.next();
            
    
            System.out.println("Informe seu número de telefone");
            telefonePessoas [i] = scan.nextInt();
            
            System.out.println("");
        }
        
        for (int i = 0; i <nomes.length; i++) {
            System.out.println("Digite o nome da pessoa que deseja procurar");
            nomeDeseja = nomes[i];
            
            
            
        }
        
        
        
    }
}
