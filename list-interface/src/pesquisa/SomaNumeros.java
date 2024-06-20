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
  /**
   * Método para adicionar um novo número à lista.
   *
   * @param  numero  o número a ser adicionado à lista
   */
  public void adicionarNumero(int numero) {
    Numero item = new Numero(numero);
    this.somaList.add(item);
  }
  /**
   * Calcula a soma de todos os números na lista somaList.
   *
   * @return a soma de todos os números na lista somaList, ou 0 se a lista estiver vazia.
   */
   public int calcularSoma() {

    int someTotal = 0;
    if (!somaList.isEmpty()) {
      for (Numero n : somaList) {
        someTotal += n.getNumero();
      }
    }
    return someTotal;
  }
/**
 * Encontra o maior número na lista e o retorna.
 *
 * @return uma lista contendo o maior número na lista, ou lança uma RuntimeException se a lista estiver vazia
 */
  public List<Numero> encontrarMaiorNumero() {
    if (!somaList.isEmpty()) {
      Collections.sort(somaList, Comparator.comparingInt(Numero::getNumero).reversed());
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
    return somaList;
  }
 /**
* Encontra o menor número na lista e o retorna.
*
* @return uma lista contendo o menor número na lista, ou lança uma RuntimeException se a lista estiver vazia
*/
  public List<Numero> encontrarMenorNumero() {
    if (!somaList.isEmpty()) {
      Collections.sort(somaList, Comparator.comparingInt(Numero::getNumero));
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
    return somaList;
  }

/**
* Retorna a lista de números se não estiver vazia, caso contrário, lança uma RuntimeException com a mensagem "A lista está vazia!".
*
* @return a lista de números
*/
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
