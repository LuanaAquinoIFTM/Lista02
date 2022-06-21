package br.edu.iftm.JavaEx09.testes;

import br.edu.iftm.JavaEx09.classes.Lampada;

import java.util.Scanner;

public class MainL {

    public static void main(String[] args) {

        Lampada l = new Lampada();
        Scanner entrada = new Scanner(System.in);
        int comando;

        System.out.println("O estado atual da lâmpada:");
        l.Estadol();

        do {
            System.out.println("1 - Ligar a lâmpada");
            System.out.println("2 - Desligar a lâmpada");
            System.out.println("3 - Ver o estado da lâmpada");
            System.out.println("0 - Sair");
            System.out.println("Digite uma opcao: ");
            comando = entrada.nextInt();

            switch (comando) {
                case 1:
                    l.Acender();
                    System.out.println("Lâmpada ligada💡 \n");
                    break;
                case 2:
                    l.Apagar();
                    System.out.println("Lâmpada desligada\n ");
                    break;

                case 3:
                    l.Estadol();
                    break;
            }
            }
            while (comando != 0) ;
        }
    }
