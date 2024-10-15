package academy.devdojo.olafabricio.javacore.Bintroducaometodos.test;

import academy.devdojo.olafabricio.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Fabricio");
        funcionario.setIdade(19);
        funcionario.setSalarios(new double[]{800, 1200, 3500});
        funcionario.imprime();
        System.out.println("Média "+ funcionario.getMedia());
    }
}
