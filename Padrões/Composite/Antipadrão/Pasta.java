package Antipadrão;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements ArquivoSistema{

    private List<String> arquivos = new ArrayList<>();


    @Override
    public void open() {
        System.out.println("A pasta foi aberta e contem esses arquivos");
        for (String arquivo : arquivos) {
            System.out.println(arquivo);
        }
    }

    @Override
    public void close() {
        System.out.println("A pasta foi fechada");
    }

    @Override
    public void adicionarArquivo(String novoArquivo) {
        arquivos.add(novoArquivo);
    }

    @Override
    public void removerArquivo(String objetoParaRemover) {
        arquivos.remove(objetoParaRemover);
    }
}
