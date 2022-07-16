package DesafioIndiceVetor;

//Desenvolva um programa que guarde em um vetor nomes de funcionários de uma empresa.  Deve-se permitir que, ao indicar
// o índice do vetor, seja indicado qual funcionário está armazenado dentro dessa memória.

import java.io.IOException;
import java.util.Scanner;

public class Desafio3 {

    public static void main(String[] args) throws IOException {

        System.out.println("Nomes dos funcionarios: ");
        Scanner input = new Scanner(System.in);
        String[] nomes = new String[5];
        for (int i = 0; i < nomes.length; i++)
        {nomes[i] = input.nextLine();}

        int pos = input.nextInt();
        System.out.println(nomes[pos] + " ");

    }
}
