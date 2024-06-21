package OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
  private Set<Palavra> palavrasSet;

  public ConjuntoPalavrasUnicas() {
    this.palavrasSet = new HashSet<>();
  }

  public void adicionarPalavra(String palavra) {
    palavrasSet.add(new Palavra(palavra));
  }

  /**
   * Removes a given word from the set of unique words.
   *
   * @param palavra the word to be removed
   */
  public String removerPalavra(String palavra) {
    Palavra palavraParaRemover = null;
    for (Palavra p : palavrasSet) {
      if (p.getPalavra() == palavra) {
        palavraParaRemover = p;
        break;

      }
    }
    palavrasSet.remove(palavraParaRemover);
    return palavraParaRemover.getPalavra();
  }

  public void verificarPalavra(String palavra) {
    for (Palavra p : palavrasSet) {
      if (p.getPalavra().equals(palavra)) {
        System.out.println("Palavra encontrada");
        break;
      }
      System.out.println("Palavra nao encontrada");
    }
  }

  public void exibirPalavrasUnicas() {
    if (!palavrasSet.isEmpty()) {
      System.out.println(palavrasSet);
    } else {
      System.out.println("Conjunto vazio");
    }
  }

  public static void main(String[] args) {
    ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

    conjuntoPalavrasUnicas.adicionarPalavra("teste");
    conjuntoPalavrasUnicas.adicionarPalavra("Palavra 2");
    conjuntoPalavrasUnicas.adicionarPalavra("Palabra 3");
    conjuntoPalavrasUnicas.adicionarPalavra("5");

    conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    conjuntoPalavrasUnicas.removerPalavra("Palavra 2");
    conjuntoPalavrasUnicas.exibirPalavrasUnicas();

    conjuntoPalavrasUnicas.verificarPalavra("Palavra 3");

  }

}