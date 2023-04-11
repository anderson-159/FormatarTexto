package FormatosMensagem;

import java.time.LocalDateTime;

public class FormatarMensagemComDataHora implements FormatarMensagem {

    @Override
    public String formatarMensagem(String mensagem) {
        return LocalDateTime.now() + " " + mensagem;
    }

}
