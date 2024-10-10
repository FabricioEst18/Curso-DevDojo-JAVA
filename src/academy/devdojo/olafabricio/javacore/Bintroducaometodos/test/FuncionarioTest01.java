package academy.devdojo.olafabricio.javacore.Bintroducaometodos.test;

import academy.devdojo.olafabricio.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Fabricio";
        funcionario.idade = 19;
        funcionario.salarios = new double[]{800, 1200, 3500};

        funcionario.imprime();
    }
}
