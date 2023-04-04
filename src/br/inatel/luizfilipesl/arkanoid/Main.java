package br.inatel.luizfilipesl.arkanoid;

import br.inatel.luizfilipesl.arkanoid.engine.Bloco;
import br.inatel.luizfilipesl.arkanoid.engine.Conversor;
import br.inatel.luizfilipesl.arkanoid.jogador.Jogador;

public class Main {
    public static void main(String[] args) {
        Bloco bloco01 = new Bloco();
        Bloco bloco02 = new Bloco();
        Bloco bloco03 = new Bloco();
        Bloco bloco04 = new Bloco();

        Jogador player = new Jogador();

        System.out.println("--- Arkanoid ---");
        System.out.println("Blocos em jogo: " + Bloco.getNumero_blocos());
        System.out.println("Pontos do jogador: " + player.getPontos());
        System.out.println("-------------------------------------");

        player.destruirBlocos(bloco01);

        System.out.println("Blocos em jogo: " + Bloco.getNumero_blocos());
        System.out.println("Pontos do jogador: " + player.getPontos());

        player.destruirBlocos(bloco02);

        System.out.println("Blocos em jogo: " + Bloco.getNumero_blocos());
        System.out.println("Pontos do jogador: " + player.getPontos());

        player.destruirBlocos(bloco03);

        System.out.println("Blocos em jogo: " + Bloco.getNumero_blocos());
        System.out.println("Pontos do jogador: " + player.getPontos());

        player.destruirBlocos(bloco04);

        System.out.println("Blocos em jogo: " + Bloco.getNumero_blocos());
        System.out.println("Pontos do jogador: " + player.getPontos());

        if(Bloco.getNumero_blocos() == 0) {
            System.out.println("Todos os blocos foram destruídos!!");
            System.out.println("Fim do jogo!");
            Conversor.converter(player.getPontos());
        }

    }
}
