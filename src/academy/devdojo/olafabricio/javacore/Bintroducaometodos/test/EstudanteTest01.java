package academy.devdojo.olafabricio.javacore.Bintroducaometodos.test;

import academy.devdojo.olafabricio.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.olafabricio.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();


        estudante01.nome = "Cleber";
        estudante01.idade = 22;
        estudante01.sexo = 'M';

        estudante02.nome = "Jussara";
        estudante02.idade = 23;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);

        impressora.imprime(estudante02);


    }
}
