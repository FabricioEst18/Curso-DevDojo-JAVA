package academy.devdojo.olafabricio.javacore.Dconstrutores.test;


import academy.devdojo.olafabricio.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Sword Art Online", "TV", 12, "Ação", "A-1 Pictures");
        anime.imprime();
    }
}
