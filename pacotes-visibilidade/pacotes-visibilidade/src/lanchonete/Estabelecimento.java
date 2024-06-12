package lanchonete;

import area.cliente.Cliente;
import atendimento.Atentende;
// import atendimento.cozinha.Almoxarife;
import atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
  public static void main(String[] args) {

    Cozinheiro cozinheiro = new Cozinheiro();
    // ações que não precisam estarem disponiveis para toda aplicação
    // cozinheiro.lavarIngrediente();
    // cozinheiro.baterVitaminaLiquidificador();
    // cozinheiro.selecionarIngredientesVitamina();
    // cozinheiro.prepararLanche();
    // cozinheiro.prepararvitamina();
    // cozinheiro.prepararCombo();

    // ações que estabelecimento precisa saber
    cozinheiro.adionarSucoNoBalcao();
    cozinheiro.adicionarLancheNobalcao();
    cozinheiro.prepararComboNoBalcao();
    // cozinheiro.prepararLanche();

    // Almoxarife almoxarife = new Almoxarife();
    // // ações que não precisam estarem disponiveis para toda aplicação
    // almoxarife.controlarEntrada();
    // almoxarife.controlarSaida();
    // ações que somente o seu pacote cozinha precisa saber /(default)
    // almoxarife.entregarIngredientes();
    // almoxarife.trocarGas();

    Atentende atentende = new Atentende();
    // atentende.pegarLancheCozinha();
    atentende.servindoMesa();
    atentende.receberPagamento();
    // ações que somente o seu pacote cozinha precisa saber /(default)
    // atentende.trocarGas();

    Cliente cliente = new Cliente();
    cliente.escolherLanche();
    cliente.fazerPedido();
    cliente.pagarConta();

    // não deveria, mas o estabelecimento precisa saber
    // cliente.pegarPedidoBalcao();

    // esta ação é muito sigilosa, que tal ser privada?
    // cliente.consultarSaldoAplicativo();

    // já pensou os clientes ouvindo que o gás acabou?
    // cozinheiro.pedirParaTrocarGas(atentende);
    // cozinheiro.pedirParaTrocarGas(almoxarife);

  }
}
