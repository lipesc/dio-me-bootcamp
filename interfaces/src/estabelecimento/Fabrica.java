package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
  public static void main(String[] args) {
    EquipamentoMultifuncional em = new EquipamentoMultifuncional();

    Impressora impressora = em;
    Digitalizadora digitalizadora = em;
    Copiadora copiadora = em;

    digitalizadora.digitalizar();
    impressora.imprimindo();
    copiadora.copiar();
  }
}
