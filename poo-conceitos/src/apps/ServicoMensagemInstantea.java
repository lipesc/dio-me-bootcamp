package apps;

public abstract class ServicoMensagemInstantea {
  public abstract void enviarMensagem();

  public abstract void receberMensagem();

  // metodo que todos filhos implementão
  public abstract void salvarHistoricoMensagem();

  // somente os filhos conhecem este metodo
  protected void validarConexao() {
    System.out.println("******************\nValidado. Está concectado!!\n******************");
  }

}
