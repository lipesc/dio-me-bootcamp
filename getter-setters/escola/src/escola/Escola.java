package escola;

public class Escola {
  public static void main(String[] args) {

    Aluno felipe = new Aluno();

    felipe.setNome("fehh");
    felipe.setIdade(29);

    System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos de idade.");
  }
}
