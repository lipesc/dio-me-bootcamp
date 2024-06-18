import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantea;
import apps.Telegram;

public class ComputadorPedrinho {
  public static void main(String[] args) {
    ServicoMensagemInstantea smi = null;

    /*
     * não se sabe qual app
     * mas devera enviar e receber mensagem
     */

    String appEscolhido = "tlg";

    if (appEscolhido.equals("msn"))
      smi = new MSNMessenger();
    else if (appEscolhido.equals("fbm"))
      smi = new FacebookMessenger();
    else if (appEscolhido.equals("tlg"))
      smi = new Telegram();

    smi.enviarMensagem();
    smi.receberMensagem();
    smi.salvarHistoricoMensagem();
  }
}
