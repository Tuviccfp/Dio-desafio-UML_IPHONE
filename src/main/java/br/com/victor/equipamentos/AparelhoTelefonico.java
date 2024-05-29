package br.com.victor.equipamentos;

import br.com.victor.funcionalidades.NavegadorInternet;
import br.com.victor.funcionalidades.ReprodutorMusical;

public abstract class AparelhoTelefonico implements ReprodutorMusical, NavegadorInternet {
    protected abstract void ligar();
    protected abstract void atender();
    protected abstract void iniciarCorreioVoz();
    public void funcionalidadesBasicas() {
        ligar();
        atender();
        iniciarCorreioVoz();
    }
}
