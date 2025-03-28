package OperacoesBasicasSet;

import java.util.Objects;
 
 public class Convidados {
   //atributos
   private String nome;
   private int codigoConvite;
 
   public Convidados(String nome, int codigoConvite) {
     this.nome = nome;
     this.codigoConvite = codigoConvite;
   }
 
   public String getNome() {
     return nome;
   }
 
   public int getCodigoConvite() {
     return codigoConvite;
   }
 
   @Override
   public boolean equals(Object o) {
     if (this == o) return true;
     if (!(o instanceof Convidados convidados)) return false;
     return getCodigoConvite() == convidados.getCodigoConvite();
   }
 
   @Override
   public int hashCode() {
     return Objects.hash(getCodigoConvite());
   }
 
   @Override
   public String toString() {
     return "Convidado{" +
         "nome='" + nome + '\'' +
         ", codigoConvite=" + codigoConvite +
         '}';
   }
 }
