package academy.devdojo.olafabricio.javacore.Hheranca.test;

import academy.devdojo.olafabricio.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.olafabricio.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.olafabricio.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Queens");
        endereco.setCep("12345-120");
        Pessoa pessoa = new Pessoa("Peter Parker");
        pessoa.setCpf("1123344");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Bruce Wayne");
        funcionario.setCpf("12345-567");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(1.000000000000000F);
        System.out.println("-----------------");
        funcionario.imprime();
    }
}
