package academy.devdojo.olafabricio.javacore.Bintroducaometodos.test;

import academy.devdojo.olafabricio.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Fabricio");
        pessoa.setIdade(-1);
//        pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
