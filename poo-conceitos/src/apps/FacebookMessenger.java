package apps;

public class FacebookMessenger extends ServicoMensagemInstantea {
    public void enviarMensagem() {
        validarConexao();
        System.out.println("enviando mensagem pelo FacebookMessenger");
    }

    public void receberMensagem() {
        System.out.println("recebendo mensagem pelo FacebookMessenger");
    }

    public void salvarHistoricoMensagem() {
        System.out.println("**_historico_salvo**");
    }

}