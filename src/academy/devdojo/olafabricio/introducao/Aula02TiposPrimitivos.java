package academy.devdojo.olafabricio.introducao;

import java.sql.SQLOutput;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int,double,float,char,byte,short,long,boolean
        int idade = (int)1000000000L;
        long numeroGrande = (long) 155.33;
        double salarioDouble = 2000.0D;
        float salarioFloatt = (float) 2500.0D;
        byte idadeByte = 127;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere =  '\u0041';
        String nome = "Fabrício";
        
        System.out.println("A idade é "+ idade+" anos");
        System.out.println(falso);
        System.out.println("char"+caractere);
        System.out.println("Oi meu nome é "+nome);
    }
}
