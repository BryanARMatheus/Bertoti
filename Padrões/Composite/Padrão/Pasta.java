package Padrão;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements ArquivosSistema{

    private String nome;
    private List<ArquivosSistema> arquivos;
    int tamanhoTotal = 0;

    public Pasta(String nome){
        this.nome = nome;
        this.arquivos = new ArrayList<>();
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getTamanho() {

        for (ArquivosSistema arquivo : arquivos){
            tamanhoTotal += arquivo.getTamanho();
        }

        return tamanhoTotal;
    }

    @Override
    public void exibir() {
        System.out.println("Pasta: " + nome +
                "\n Tamanho: " + getTamanho() + " bytes");

        for (ArquivosSistema arquivo : arquivos) {
            System.out.println("Arquivos da pasta");
            arquivo.exibir();
        }
    }

    @Override
    public boolean isArquivo() {
        return false;
    }

    public void adicionarArquivo(ArquivosSistema arquivoNovo){
        arquivos.add(arquivoNovo);
    }

    public void removerArquivo(ArquivosSistema arquivoParaRemover){
        arquivos.remove(arquivoParaRemover);
    }

    public ArquivosSistema procurarArquivo(String nome) {
        return arquivos.stream()
                .filter(arquivo -> arquivo.getNome().equals(nome))
                .findFirst()
                .orElse(null);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
