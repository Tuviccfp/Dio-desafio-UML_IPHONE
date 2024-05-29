package br.com.victor.modelo;

import br.com.victor.equipamentos.AparelhoTelefonico;

public class Iphone extends AparelhoTelefonico {
    @Override
    protected void ligar() {
        System.out.println("Fazendo uma ligação do iphone");
    }

    @Override
    protected void atender() {
        System.out.println("Atendendo uma ligação do iphone");
    }

    @Override
    protected void iniciarCorreioVoz() {
        System.out.println("Iniciando correio voz do iphone");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina do navegador Safari");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina do navegador Safari");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando novo aba no navegador Safari");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica no iTunes");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica no iTunes");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica no iTunes" + musica);
    }
}
