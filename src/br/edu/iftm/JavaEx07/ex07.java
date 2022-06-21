package br.edu.iftm.JavaEx07;

import java.util.Scanner;

public class ex07 {

    public static void main(String[] args) {

        Scanner media = new Scanner(System.in);

        int i = 1;
        int soma = 0;
        double total = 0;

        while (i <= 10) {
            System.out.println("Informe um número: ");
            int num = media.nextInt();


            if(num % 3 == 0){
                soma += num;
                total++;
            }
            i++;
            }
        total = soma / total;
        System.out.println("A média dos números múltiplos de 3 é igual a " + total);
        }

    }

