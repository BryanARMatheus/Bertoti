package Antipadrão;

public class ArquivoTexto implements ArquivoSistema{

    private String texto;

    @Override
    public void open() {
        System.out.println(texto);
    }

    @Override
    public void close() {
        System.out.println("O arquivo foi fechado");
    }

    @Override
    public void adicionarArquivo(String novoArquivo) {
        throw new UnsupportedOperationException("Este tipo de arquivo não suporta essa ação");
    }

    @Override
    public void removerArquivo(String objetoParaRemover) {
        throw new UnsupportedOperationException("Este tipo de arquivo não suporta essa ação");
    }
}
