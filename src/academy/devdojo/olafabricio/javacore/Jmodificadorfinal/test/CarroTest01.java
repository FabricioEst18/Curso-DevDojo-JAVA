package academy.devdojo.olafabricio.javacore.Jmodificadorfinal.test;

import academy.devdojo.olafabricio.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.olafabricio.javacore.Jmodificadorfinal.dominio.Comprador;
import academy.devdojo.olafabricio.javacore.Jmodificadorfinal.dominio.Lamborghini;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Brian");
        System.out.println(carro.COMPRADOR);
        Lamborghini lamborghini = new Lamborghini();
        lamborghini.setNome("Aventador");
        lamborghini.imprime();
    }
}
