package apps;

public class MSNMessenger extends ServicoMensagemInstantea {
    @Override
    public void enviarMensagem() {
        validarConexao();
        System.out.println("enviando mensagem pelo MSN mensagem");
    }

    public void receberMensagem() {
        System.out.println("recebendo mensagem pelo MSN mensagem");
    }

    public void salvarHistoricoMensagem() {
        System.out.println("**_historico_salvo**");
    }

}
