package ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
  private List<Pessoa> pessoaList;

  public OrdenacaoPessoa() {
    this.pessoaList = new ArrayList<>();
  }
  
  public void adicionarPessoa(String nome, int idade, double altura) {
    pessoaList.add(new Pessoa(nome, idade, altura));
  }

  public List<Pessoa> ordenarPorIdade() {
    List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
    Collections.sort(pessoasPorIdade);
    return pessoasPorIdade;
  }
  public List<Pessoa> ordenarPorAltura() {
    List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
    Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
    return pessoasPorAltura;
  }
  public static void main(String[] args) {
    OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
    ordenacaoPessoa.adicionarPessoa("João", 25, 1.75);
    ordenacaoPessoa.adicionarPessoa("Maria", 30, 1.65);
    ordenacaoPessoa.adicionarPessoa("Pedro", 20, 1.80);

    // System.out.println( ordenacaoPessoa.ordenarPorIdade()+"\n");
    // System.out.println();

    System.out.println(ordenacaoPessoa.ordenarPorAltura());

  }
}

