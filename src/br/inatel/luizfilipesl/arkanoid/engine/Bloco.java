package br.inatel.luizfilipesl.arkanoid.engine;


public class Bloco {

    private static int numero_blocos = 0;

    public Bloco() {
        numero_blocos++;
    }

    public void destruir() {
        System.out.println("Bloco destruído!");
        numero_blocos--;
    }
    public static int getNumero_blocos() {
        return numero_blocos;
    }
}
