package academy.devdojo.olafabricio.javacore.Aintroducaoclasses.test;

import academy.devdojo.olafabricio.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Anakin";
        professor.idade = 43;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + "Idade: " + professor.idade + "Sexo: " + professor.sexo);
    }
}
