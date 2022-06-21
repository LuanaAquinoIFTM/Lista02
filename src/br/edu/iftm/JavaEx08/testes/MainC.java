package br.edu.iftm.JavaEx08.testes;

import br.edu.iftm.JavaEx08.classes.Contador;

import java.util.Scanner;

public class MainC {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Contador cont = new Contador();
        int comando;

        do {
            System.out.println("1 - Zerar valor");
            System.out.println("2 - Incrementar valor");
            System.out.println("3 - Obter valor");
            System.out.println("0 - Sair");
            System.out.print("Digite uma opcao: ");
            comando = entrada.nextInt();

            switch (comando) {
                case 1:
                    cont.Zerar();
                    System.out.println("Zerando o contador: " +cont.Zerar());
                    break;
                case 2:
                    System.out.println("Incrementando valor : " +cont.Incrementar() );
                    break;

                case 3:
                    cont.ObterValor();
                    System.out.println("Retornando Valor : " +cont.ObterValor() );
                    break;
            }
        }
        while (comando != 0) ;

    }
}
