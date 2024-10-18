package academy.devdojo.olafabricio.javacore.Gassociacao.test;

import academy.devdojo.olafabricio.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.olafabricio.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Arrascaeta");
        Jogador jogador2 = new Jogador("Gabigol");
        Time time = new Time("Cruzeiro");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("----Jogador----");
        jogador.imprime();

        System.out.println("----Time----");
        time.imprime();
    }
}
