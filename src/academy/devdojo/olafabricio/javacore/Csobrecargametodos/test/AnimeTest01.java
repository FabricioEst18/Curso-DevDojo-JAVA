package academy.devdojo.olafabricio.javacore.Csobrecargametodos.test;

import academy.devdojo.olafabricio.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Sword Art Online", "TV", 12, "Ação");
        anime.imprime();
    }
}
