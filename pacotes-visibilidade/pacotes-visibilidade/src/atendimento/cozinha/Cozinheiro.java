package atendimento.cozinha;

// import atendimento.Atentende;

public class Cozinheiro {

  // pode ser default
  public void adicionarLancheNobalcao() {
    System.out.println("Adicionando lanche natural humburger no balcão");
  }
  // pode ser default

  public void adionarSucoNoBalcao() {
    System.out.println("Adicionando suco natural no balcão");
  }
  // pode ser default

  public void prepararComboNoBalcao() {
    adicionarLancheNobalcao();
    adionarSucoNoBalcao();
  }
  // pode ser default

  private void prepararLanche() {
    System.out.println("Preparando lanche tipo humburger");
  }

  private void prepararvitamina() {
    System.out.println("Preparando vitamina");
  }

  private void preaparaCombo() {
    prepararLanche();
    prepararvitamina();
  }

  private void selecionarIngredientesLanche() {
    System.out.println("Selecionando o pão, queijo e presunto");
  }

  private void selecionarIngredientesVitamina() {
    System.out.println("Selecionando vitamina fruta, leite e mel");
  }

  private void lavarIngrediente() {
    System.out.println("Lavando o pão, queijo e presunto");
  }

  private void lavarIngredientes() {
    System.out.println("Lavando ingredientes");
  }

  private void baterVitaminaLiquidificador() {
    System.out.println("Bateu vitamina");
  }

  private void fritarIngredientesLanche() {
    System.out.println("Fritando o pão, queijo e presunto");
  }

  // public void pedirParaTrocarGas(Atentende atentende) {
  // atentende.trocarGas();
  // }

  private void pedirParaTrocarGas(Almoxarife almoxarife) {
    almoxarife.entregarIngredientes();
  }

  private void pedirIngredientes(Almoxarife almoxarife) {
    almoxarife.entregarIngredientes();
  }

}