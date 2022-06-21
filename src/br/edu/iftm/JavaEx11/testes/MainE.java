package br.edu.iftm.JavaEx11.testes;

import br.edu.iftm.JavaEx11.classes.Elevador;

import java.util.Scanner;

public class MainE {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos andares tem o prédio? ");
        int totalAndar = entrada.nextInt() - 1;

        System.out.print("Qual a capacidade máxima de pessoas no elevador? ");
        int totalPessoa = entrada.nextInt();

        Elevador e = new Elevador(totalPessoa, totalAndar);

        int opcao = 0;
        do {
            System.out.println("1 - Entrar no elevador");
            System.out.println("2 - Sair do elevador");
            System.out.println("3 - Subir um andar");
            System.out.println("4 - Descer um andar");
            System.out.println("0 - Sair do programa");
            System.out.println("Digite uma opcao: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    e.entrar();
                    break;
                case 2:
                    e.sair();
                    break;
                case 3:
                    e.subir();
                    break;
                case 4:
                    e.descer();
                    break;

            }
        }while(opcao != 0);
    }
}
