package ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
  private String pessoa;
  private int idade;
  private double altura;

  public Pessoa(String pessoa, int idade, double altura) {
    this.pessoa = pessoa;
    this.idade = idade;
    this.altura = altura;
  }

  @Override
  public int compareTo(Pessoa p) {
    // TODO Auto-generated method stub
    return Integer.compare(idade, p.getIdade());
  }

  public String getPessoa() {
    return pessoa;
  }

  public int getIdade() {
    return idade;
  }

  public double getAltura() {
    return altura;
  }

  @Override
  public String toString() {
    return "Pessoa = " + pessoa + ", idade = " + idade + ", altura = " + altura + "\n";
  }
}

class ComparatorPorAltura implements Comparator<Pessoa> {
  @Override
  public int compare(Pessoa p1, Pessoa p2) {
    return Double.compare(p1.getAltura(), p2.getAltura());
  }
}
