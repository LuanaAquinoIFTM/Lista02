package br.edu.iftm.JavaEx04;

import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite algum número:");
        int num = teclado.nextInt();

        System.out.println("\nOs 20 múltiplos desse número:\n");

        for (int i = 1; i <= 20; i++) {
            System.out.println( num + " x " + i + " = " + num*i);
        }


    }

}
