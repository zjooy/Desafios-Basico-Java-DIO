package DesafioDomino;

import java.util.Scanner;

//estamos precisando da sua ajuda para escrever um programa que, dado o valor N use esta fórmula(((N+1)*(N+2))/2)
// para calcular e imprimir quantas peças existem num jogo de dominó do tipo duplo-N.

public class Desafio2 {
    public static void main(String[] args) {

        System.out.println("Digite o valor: ");
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        System.out.println((n + 1) * (n + 2)/2);
    }
}

