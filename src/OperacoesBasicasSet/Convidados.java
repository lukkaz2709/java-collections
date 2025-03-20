package OperacoesBasicasSet;

public class Convidados {
    private String Nome;

    private int CodigoConvite;

    public Convidados(String nome, int codigoConvite) {
        Nome = nome;
        CodigoConvite = codigoConvite;
    }

    public String getNome() {
        return Nome;
    }

    public int getCodigoConvite() {
        return CodigoConvite;
    }

    @Override
    public String toString() {
        return "Convidados [Nome=" + Nome + ", CodigoConvite=" + CodigoConvite + "]";
    }

    
}
