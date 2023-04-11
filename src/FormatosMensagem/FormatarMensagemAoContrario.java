package FormatosMensagem;

import FormatosMensagem.FormatarMensagem;

public class FormatarMensagemAoContrario implements FormatarMensagem {

    @Override
    public String formatarMensagem(String mensagem) {

        String retorno = "";
        for (int i=mensagem.length() - 1; i >= 0; i--) {
            retorno += mensagem.charAt(i);
        }

        return retorno;
    }

}

