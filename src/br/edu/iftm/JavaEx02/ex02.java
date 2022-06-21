package br.edu.iftm.JavaEx02;

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número de 0 a 100: ");
        double num = entrada.nextDouble();

        if (num >= 0 && num <= 100) {
            if (num % 2 == 0) {
                System.out.println("Número par!");
            }else{
                System.out.println("Número ímpar!");
            }

        }else{
            System.out.println("Número fora da faixa!");
        }
    }
}