package apps;

public class Telegram extends ServicoMensagemInstantea {
    public void enviarMensagem() {
        validarConexao();
        System.out.println("enviando mensagem pelo Telegram");
    }

    public void receberMensagem() {
        System.out.println("recebendo mensagem pelo Telegram");
    }

    public void salvarHistoricoMensagem() {
        System.out.println("**_historico_salvo**");
    }

}