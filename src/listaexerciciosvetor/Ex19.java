/*
    @author Luan Magalhães

    19) Ler as duas notas bimestrais para um conjunto de 10 alunos. 
        Armazenar as notas informadas em dois vetores “Nota1” e “Nota2” do tipo real. 
        Escreva um programa que calcule a média aritmética simples das notas informadas armazenando 
        o resultado em um vetor “Result” de mesmo tipo e tamanho. Ao mostrar os resultados exibir a situação
        de cada aluno. Se a média calculada for superior ou igual a 7 o aluno estará “aprovado”, caso contrário, a situação do aluno será “reprovado”

 */
package listaexerciciosvetor;

import java.util.Scanner;


public class Ex19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        int tamanhoVetor = 10;
        double soma = 0;
        
        
        int vetorAlunos [] = new int [tamanhoVetor];
        double nota1 [] = new double [10];
        double nota2 [] = new double [10];
        double vetorSomas [] = new double [10];
        double vetorMedia[] = new double [10];
        
        for (int i = 0; i <vetorAlunos.length; i++) {
            System.out.println("Informe a sua 1 nota, aluno: " +(1+i));
            nota1[i] = scan.nextDouble();
        }
        
        System.out.println("");
        for (int i = 0; i <vetorAlunos.length; i++) {
            System.out.println("Informe a sua 2 nota, aluno: "+(1+i));
            nota2[i] = scan.nextDouble();
        }
        
        for (int i = 0; i <nota1.length; i++) {
            vetorSomas[i] = nota1[i] + nota2[i];
        }
        
        for (int i = 0; i <nota2.length; i++) {
            vetorMedia[i] = vetorSomas[i] / 2;
        }
        
        System.out.println("");
        System.out.println("Média");
        for (int i = 0; i <vetorMedia.length; i++) {
            System.out.println("Aluno: "+ (1+i) + " Sua média: " +vetorMedia[i]);
        }
       
        System.out.println("");
        
        for (int i = 0; i < 10; i++) {
            if(vetorMedia[i] >= 7){
                System.out.println("Aluno aprovado, Aluno: " +(1+i));
            }
            else {
                System.out.println("Aluno reprovado, Aluno: "  +(1+i));
            }
        }
                
               
        
    }
}
