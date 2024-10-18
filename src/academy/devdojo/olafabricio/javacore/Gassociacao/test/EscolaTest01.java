package academy.devdojo.olafabricio.javacore.Gassociacao.test;

import academy.devdojo.olafabricio.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.olafabricio.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Raimundo");
        Professor professor2 = new Professor("Toreto");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Rio Branco", professores);

        escola.imprime();
    }
}
