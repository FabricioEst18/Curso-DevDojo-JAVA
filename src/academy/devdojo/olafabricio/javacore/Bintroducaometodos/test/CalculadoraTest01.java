package academy.devdojo.olafabricio.javacore.Bintroducaometodos.test;

import academy.devdojo.olafabricio.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumero();
        System.out.println("Finalizando CalculadoraTest01");
        calculadora.subtraindoDoisNumeros();
    }
}
