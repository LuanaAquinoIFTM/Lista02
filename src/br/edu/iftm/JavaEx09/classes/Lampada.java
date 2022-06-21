package br.edu.iftm.JavaEx09.classes;

public class Lampada {

    private boolean acesa;

    // construtor
    public Lampada()
    {
        acesa = false;
    }

    // métodos
    public void Acender()
    {
        acesa = true;
    }

    public void Apagar()
    {
        acesa = false;
    }

    public boolean EstaAcesa()
    {
        return acesa;
    }

    public void Estadol(){
        if(acesa){
            System.out.println("A lâmpada está ligada💡");
        }else{
            System.out.println("A lâmpada está desligada");
        }
    }

    public int opcao() {
        return 0;
    }

    }


