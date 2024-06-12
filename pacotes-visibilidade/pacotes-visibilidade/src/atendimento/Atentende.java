package atendimento;

public class Atentende {
  public void servindoMesa() {
    pegarLancheCozinha();
    System.out.println("Servindo a mesa");
  }

  private void pegarLancheCozinha() {
    System.out.println("Pegando lanche da cozinha");
  }

  public void receberPagamento() {
    System.out.println("Recebendo o pagamento");
  }

   void trocarGas() {
    System.out.println("Atentende Trocar gas");
  }

  public void pegarPedidoBalcao() {
    System.out.println("Pegando o pedido no balcão");
  }
}