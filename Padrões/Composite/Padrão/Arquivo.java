package Padrão;

import Antipadrão.ArquivoSistema;

public class Arquivo implements ArquivosSistema {

    private String nome;
    private int tamanho;
    private String conteudo;

    public Arquivo(String nome, String conteudo){
        this.nome = nome;
        this.tamanho = conteudo.length();
        this.conteudo = conteudo;
    }

    @Override
    public void exibir() {
        System.out.println(nome + " (" + tamanho + " caracteres)");
    }

    @Override
    public boolean isArquivo() {
        return true;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getTamanho() {
        return tamanho;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
        this.tamanho = conteudo.length();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
