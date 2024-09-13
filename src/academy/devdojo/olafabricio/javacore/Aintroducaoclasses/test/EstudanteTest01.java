package academy.devdojo.olafabricio.javacore.Aintroducaoclasses.test;

import academy.devdojo.olafabricio.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Fabrício";
        estudante.idade = 19;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
