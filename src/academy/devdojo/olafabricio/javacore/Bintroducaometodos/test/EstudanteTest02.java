package academy.devdojo.olafabricio.javacore.Bintroducaometodos.test;

import academy.devdojo.olafabricio.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.olafabricio.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();


        estudante01.nome = "Cleber";
        estudante01.idade = 22;
        estudante01.sexo = 'M';

        estudante02.nome = "Jussara";
        estudante02.idade = 23;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
