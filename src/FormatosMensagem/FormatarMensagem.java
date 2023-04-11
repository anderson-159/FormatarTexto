package FormatosMensagem;// Criar um programa que pergunte para o usuario em qual formato ele quer imprimir uma mensagem:

// Entrada: mensagem, formato
// Saída: mensagem no formato escolhido

// Formatos aceitos:
// Tudo em maiusculo
// String.toUppercase();
// Tudo minusculo
// String.toLowerCase();
// Com a data e hora atual na frente da mensagem
// LocalDateTime.now() + string

// Utilizar Interface

public interface FormatarMensagem {

    String formatarMensagem(String mensagem);

}
