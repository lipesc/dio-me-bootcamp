package atendimento.cozinha;

public class Almoxarife {
  private void controlarEntrada() {
    System.out.println("Entrada controlada dos itens");
  }

  private void controlarSaida() {
    System.out.println("Saida controlada dos itens");
  }

    void entregarIngredientes() {
     System.out.println("Entregando ingredientes");
     controlarSaida();
  }

   void trocarGas() {
     System.out.println("Almoxarife Trocar gas");
  }

}