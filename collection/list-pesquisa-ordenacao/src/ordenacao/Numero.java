package ordenacao;

public class Numero implements Comparable<Numero> {
  private int numero;

  public Numero(int numero) {
    this.numero = numero;
  }

  public int getNumero() {
    return numero;
  }

  @Override
  public int compareTo(Numero o) {
    // TODO Auto-generated method stub
    return Integer.compare(numero, o.getNumero());
  }

  @Override
  public String toString() {
    return "Numero = " + numero + "\n";
  }

}
