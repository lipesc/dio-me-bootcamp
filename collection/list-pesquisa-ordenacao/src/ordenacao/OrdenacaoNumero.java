package ordenacao;
/*Crie uma classe chamada "OrdenacaoNumeros" que possui uma lista de números inteiros como atributo. Implemente os seguintes métodos:

adicionarNumero(int numero): Adiciona um número à lista.
ordenarAscendente(): Ordena os números da lista em ordem ascendente usando a interface Comparable e a class Collections.
ordenarDescendente(): Ordena os números da lista em ordem descendente usando um Comparable e a class Collections. */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumero {
  private List<Numero> numeroList;

  public OrdenacaoNumero() {
    this.numeroList = new ArrayList<>();
  }

  public void adicionarNumero(int numero) {
    numeroList.add(new Numero(numero));
  }

  public List<Numero> ordenarAscendente() {
    List<Numero> listaAscendente = new ArrayList<>(numeroList);
    Collections.sort(listaAscendente);
    return listaAscendente;
  }

  public List<Numero> ordenarDescendente() {
    List<Numero> listaDescendente = new ArrayList<>(numeroList);
    Collections.sort(listaDescendente, Collections.reverseOrder());
    return listaDescendente;
  }

  public static void main(String[] args) {
    OrdenacaoNumero ordenacaoNumero = new OrdenacaoNumero();

    ordenacaoNumero.adicionarNumero(5);
    ordenacaoNumero.adicionarNumero(6);
    ordenacaoNumero.adicionarNumero(7);
    ordenacaoNumero.adicionarNumero(7);
    ordenacaoNumero.adicionarNumero(45);

    // System.out.println(ordenacaoNumero.ordenarAscendente());
    System.out.println(ordenacaoNumero.ordenarDescendente());
  }
}
