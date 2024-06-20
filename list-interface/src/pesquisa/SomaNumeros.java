package pesquisa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SomaNumeros {
  private List<Numero> somaList;

  public SomaNumeros() {
    this.somaList = new ArrayList<>();

  }

  public void adicionarNumero(int numero) {
    Numero item = new Numero(numero);
    this.somaList.add(item);
  }

  public int calcularSoma() {

    int someTotal = 0;
    if (!somaList.isEmpty()) {
      for (Numero n : somaList) {
        someTotal += n.getNumero();
      }
    }
    return someTotal;
  }

  public List<Numero> encontrarMaiorNumero() {
    if (!somaList.isEmpty()) {
      Collections.sort(somaList, Comparator.comparingInt(Numero::getNumero).reversed());
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
    return somaList;
  }

  public List<Numero> encontrarMenorNumero() {
    if (!somaList.isEmpty()) {
      Collections.sort(somaList, Comparator.comparingInt(Numero::getNumero));
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
    return somaList;
  }

  public List<Numero> exibirNumeros() {
    if (!somaList.isEmpty()) {
      return somaList;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public static void main(String[] args) {

    SomaNumeros somaNumeros = new SomaNumeros();
    // somaNumeros.adicionarNumero(2);
    // somaNumeros.adicionarNumero(11);
    // somaNumeros.adicionarNumero(3);
    // somaNumeros.adicionarNumero(10);
    // somaNumeros.adicionarNumero(5);
    System.out.println("Calcular Soma: \n" + somaNumeros.calcularSoma());
    System.out.println("Exibir Numeros: \n" + somaNumeros.exibirNumeros());
    System.out.println("Do maior para o menor: \n" + somaNumeros.encontrarMaiorNumero());
    System.out.println("Do menor para o maior: \n" + somaNumeros.encontrarMenorNumero());
  }
}
