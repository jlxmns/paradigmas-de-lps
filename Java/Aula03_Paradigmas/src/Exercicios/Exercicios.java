package Exercicios;

import java.util.Scanner;

public class Exercicios {

    public static void exercicio1() {
        //  Exemplo de Vetor 2 em Java - calculando a média dos elementos do vetor
        //  Mais a o maior elemento do vetor e o menor elemento do vetor.
        int[] vetor = {5, 12, 7, 20, 15, 8, 3, 11, 6, 9};

        // Calcula a média, o maior valor e o menor valor
        int soma = 0;
        int maiorValor = vetor[0];
        int menorValor = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
            if (vetor[i] > maiorValor) {
                maiorValor = vetor[i];
            }
            if (vetor[i] < menorValor) {
                menorValor = vetor[i];
            }
        }

        double media = (double) soma / vetor.length;

        // Exibe os resultados
        System.out.println("Média: " + media);
        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Menor valor: " + menorValor);
    }

    public static void exercicio2() {
        //Faça um programa em Java que receba 6 números inteiros e mostre:
        //Os números pares digitados
        //A soma dos números pares digitados
        //Os números ímpares digitados
        //A quantidade de números ímpares

        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[6];
        int sumPar = 0;
        int qtdeImpar = 0;

        System.out.println("Digite 6 números inteiros:");
        for (int i = 0; i < 6; i++) {
            numbers[i] = scan.nextInt();
        }

        System.out.println();

        System.out.println("Números pares digitados:");
        for(int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num + " ");
                sumPar += num;
            }
        }

        System.out.println();

        System.out.println("Soma dos números pares: " + sumPar + "\n");

        System.out.println("Números ímpares digitados:");
        for(int num : numbers) {
            if (num % 2 != 0) {
                System.out.println(num + " ");
                qtdeImpar++;
            }
        }
        System.out.println();

        System.out.println("Quantidade de números ímpares: " + qtdeImpar);
    }

    public static void exercicio3() {
        Retangulo ret = new Retangulo(2, 3);
        System.out.println("Área: " + ret.getArea());
        System.out.println("Perímetro: " + ret.getPerimetro());
    }
}
