import FormatosMensagem.FormatarMensagem;

public class FormatarMensagemMaiuscula implements FormatarMensagem {

    @Override
    public String formatarMensagem(String mensagem) {
        String retorno = mensagem.toUpperCase();
        return retorno;
    }

}
