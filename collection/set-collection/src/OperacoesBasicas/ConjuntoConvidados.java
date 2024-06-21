package OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
  // atributos
  private Set<Convidado> convidadosSet;

  // construtor
  public ConjuntoConvidados() {
    this.convidadosSet = new HashSet<>();
  }

  // metodos
  public void adicionarConvidado(String nome, int codigoConvite) {
    convidadosSet.add(new Convidado(nome, codigoConvite));
  }

  public void removerConvidadoPorCodigoConvite(int codigoConvite) {
    Convidado convidadoParaRemover = null;

    for (Convidado c : convidadosSet) {
      if (c.getCodigoConvite() == codigoConvite) {
        convidadoParaRemover = c;
        break;
      }
    }
    convidadosSet.remove(convidadoParaRemover);
  }

  public int contarConvidados() {
    if (!convidadosSet.isEmpty()) {
      return convidadosSet.size();
    }
    throw new RuntimeException("Convidados vazios");
  }

  public void exibirConvidados() {
    if (!convidadosSet.isEmpty()) {
      System.out.println(convidadosSet);
    }
  }

  public static void main(String[] args) {
    ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

    conjuntoConvidados.adicionarConvidado("Convidado 1", 6969);
    conjuntoConvidados.adicionarConvidado("Convidado 2", 6969);
    conjuntoConvidados.adicionarConvidado("Convidado 3", 32312);
    conjuntoConvidados.adicionarConvidado("Convidado 4", 5454);
    conjuntoConvidados.adicionarConvidado("Convidado 5", 545444);
    // System.out.println(conjuntoConvidados.contarConvidados());
    conjuntoConvidados.exibirConvidados();
    System.out.println();
    conjuntoConvidados.removerConvidadoPorCodigoConvite(32312);
    conjuntoConvidados.exibirConvidados();

  }
}