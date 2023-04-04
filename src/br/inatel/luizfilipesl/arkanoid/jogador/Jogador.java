package br.inatel.luizfilipesl.arkanoid.jogador;

import br.inatel.luizfilipesl.arkanoid.engine.Bloco;

public class Jogador {

    private int pontos = 0;

    public void destruirBlocos(Bloco bloco) {
        bloco.destruir();
        pontos++;
    }

    public int getPontos() {
        return pontos;
    }
}
