import FormatosMensagem.FormatarMensagem;

public class FormatarMensagemMinuscula implements FormatarMensagem {

    @Override
    public String formatarMensagem(String mensagem) {
        String retorno = mensagem.toLowerCase();
        return retorno;
    }

}
