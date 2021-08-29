package br.com.zup;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Por favor digite a quantidade de horas trabalhadas:");
        double horasTrabalhadas = leitor.nextDouble();
        System.out.println("Por favor digite o valor recebido por hora trabalhada:");
        double valorDaHora = leitor.nextDouble();

        double salarioBruto =(horasTrabalhadas * valorDaHora);

        double impostoDeRenda = 0;
        double inss = (0.1 * salarioBruto);
        double fgts = (0.11 * salarioBruto);

        if(salarioBruto > 0 & salarioBruto <= 900){
            impostoDeRenda = 0;
        }
        else if(salarioBruto > 900 & salarioBruto <= 1500){
            impostoDeRenda= (0.05 * salarioBruto);
        }
        else if(salarioBruto > 1500 & salarioBruto <= 2500){
            impostoDeRenda= (0.1 * salarioBruto);
        }
        else if(salarioBruto > 2500){
            impostoDeRenda= (0.2 * salarioBruto);
        } else{
            System.out.println("Por favor digite uma opção válida");
        }

        double salarioLiquido = salarioBruto - impostoDeRenda - inss;

        System.out.printf("\tSalário Bruto: (%s * %s)\t: R$ %s \n", valorDaHora, horasTrabalhadas, salarioBruto);
        System.out.printf("\t(-) IR (%s%%)\t\t\t\t\t: R$ %s\n", ((impostoDeRenda / salarioBruto) * 100), impostoDeRenda);
        System.out.printf("\t(-) INSS (%s%%)\t\t\t\t: R$ %s\n",((inss/salarioBruto)*100), inss);
        System.out.printf("\tFGTS (%s%%)\t\t\t\t\t: R$ %s\n",((fgts/salarioBruto)*100), fgts);
        System.out.printf("\tTotal de descontos\t\t\t\t: R$ %s\n",(salarioBruto - salarioLiquido));
        System.out.printf("\tSalário Liquido\t\t\t\t\t: R$ %s\n",(salarioLiquido));

    }
}
