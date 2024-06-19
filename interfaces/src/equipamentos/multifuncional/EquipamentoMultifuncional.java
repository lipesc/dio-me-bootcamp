package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Impressora, Digitalizadora {

  @Override
  public void copiar() {
    // TODO Auto-generated method stub
    System.out.println("COPIANDO COM EQUIPAMENTO MULTIFUNCIONAL.");
  }

  @Override
  public void imprimindo() {
    // TODO Auto-generated method stub
    System.out.println("IMPRIMINDO COM EQUIPAMENTO MULTIFUNCIONAL.");
    
  }

  @Override
  public void digitalizar() {
    // TODO Auto-generated method stub
    System.out.println("DIGITALIZANDO COM EQUIPAMENTO MULTIFUNCIONAL.");
    
  }

}
