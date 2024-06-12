package area.cliente;

public class Cliente {
  public void escolherLanche() {
    System.out.println("Escolhendo o lanche");
  }

  public void fazerPedido() {
    System.out.println("Fazendo o pedido");
  }

  public void pagarConta() {
    consultarSaldoAplicativo();
    System.out.println("Pagando a conta");
  }

  private void consultarSaldoAplicativo() {
    System.out.println("Consultando o saldo no aplicativo");
  }

   // refatorando, atendente já faz isso
  // public void pegarPedidoBalcao() {
  //   System.out.println("Pegando o pedido no balcão");
  // }

}
