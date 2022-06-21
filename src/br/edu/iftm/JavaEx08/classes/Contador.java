package br.edu.iftm.JavaEx08.classes;

public class Contador {

    //atributos
    private int valor;

    //construtores
    public Contador(){
        valor = 0;
    }

    //métodos
    public int Zerar(){
        this.valor = 0;
        return valor;
    }

    public int Incrementar() {
        this.valor++;
        return valor;
    }

    public int ObterValor() {
        return valor;
    }
}


