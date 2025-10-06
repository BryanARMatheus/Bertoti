package Antipadrão;

public interface ArquivoSistema {
    public void open();
    public void close();
    public void adicionarArquivo(String novoArquivo);
    public void removerArquivo(String objetoParaRemover);
}
