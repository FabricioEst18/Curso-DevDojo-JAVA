package academy.devdojo.olafabricio.javacore.Gassociacao.test;

import academy.devdojo.olafabricio.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.olafabricio.javacore.Gassociacao.dominio.Local;
import academy.devdojo.olafabricio.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.olafabricio.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest01 {
    public static void main(String[] args) {
        Local local = new Local("Capital do Oeste");
        Aluno aluno = new Aluno("Goku", 25);
        Professor professor = new Professor("Mestre Kami", "Lutas");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Como vencer o Freeza", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
