public enum EstadoBrasileiro {
  SAO_PAULO("SP", "São paulo", 23),
  RIO_JANEIRO("RJ", "Rio de Janeiro", 43),
  PIUI("PI", "Piauí", 54),
  MARANHA("MA", "Maranhão", 22),
  CEARA("CE", "CEARA", 25);

  private String nome;
  private String sigla;
  private int igbe;

  private EstadoBrasileiro(String nome, String sigla, int igbe) {
    this.nome = nome;
    this.sigla = sigla;
    this.igbe = igbe;
  }

  public int getIgbe() {
    return igbe;
  }

  public String getNome() {
    return nome;
  }

  public String getSigla() {
    return sigla;
  }

  public String getNomeMaiusculo() {
    return nome.toUpperCase();
  }

}
