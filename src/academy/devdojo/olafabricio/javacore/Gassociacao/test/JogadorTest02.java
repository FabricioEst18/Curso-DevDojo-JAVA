package academy.devdojo.olafabricio.javacore.Gassociacao.test;

import academy.devdojo.olafabricio.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.olafabricio.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar");
        Time time = new Time("Barcelona");

        jogador1.setTime(time);

        jogador1.imprime();
    }
}
