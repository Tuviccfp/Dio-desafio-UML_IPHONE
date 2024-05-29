package br.com.victor;

import br.com.victor.modelo.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        System.out.println("Funcionalidades básicas:");
        iphone.funcionalidadesBasicas();

        System.out.println("\nFuncionalidades do navegador:");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.exibirPagina();

        System.out.println("\nFuncionalidades do navegador:");
        iphone.pausar();
        iphone.tocar();
        iphone.selecionarMusica(" Frank Ocean - Ivy ");
    }
}