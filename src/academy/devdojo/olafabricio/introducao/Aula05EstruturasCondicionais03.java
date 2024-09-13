package academy.devdojo.olafabricio.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Doar se salario > 5000
        double salario = 7000;
        String mensagemDoar = "Eu vou doar 500 para o Fabricio";
        String mensagemNaoDoar = "Ainda não tenho condições,mas vou ter!";
        //(condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? "Eu vou doar 500 para o Fabricio" : "Ainda não tenho condições,mas vou ter!";
        boolean possoDoar = salario > 5000;

        System.out.println(resultado);
    }
}
