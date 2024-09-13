package academy.devdojo.olafabricio.javacore.Aintroducaoclasses.test;

import academy.devdojo.olafabricio.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Gol";
        carro1.modelo = "GTI";
        carro1.ano = 2002;

        carro2.nome = "Porsche";
        carro2.modelo = "Panamera";
        carro2.ano = 2023;

        carro2 = carro1;

        System.out.println("Carro1: ");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("\nCarro2: ");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);


    }
}
