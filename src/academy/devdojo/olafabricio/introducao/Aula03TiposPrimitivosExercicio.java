package academy.devdojo.olafabricio.introducao;
/*/
Crie variáveis para os campos descritos abaixo entre <> e imprima a senguinte mensagem:

Eu <nome>,morando no endereço <endereço>,
confirmo que recebi o salário de <salário>,na data <data>
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Fabricio";
        String endereço = "Rua Radialista Sinésio Silva,170";
        double salario = 2.500;
        String dataRecebimentoSalario = "20/05/2024";

        String relatorio = "Eu "+nome+" morando no endereço "+endereço+" confirmo que recebi o salário de "+salario+" na data "+dataRecebimentoSalario;
        System.out.println(relatorio);

    }
}
