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
        System.out.println("Salário Bruto: (" + valorDaHora + " * " + horasTrabalhadas +")" + " : R$ " + salarioBruto);
        System.out.println("(-) IR (" + ((salarioBruto - impostoDeRenda) * 100) + ")" + " : R$ " + impostoDeRenda);
        System.out.println("(-) INSS (10%)" + " : R$ " + inss);
        System.out.println("FGTS (11%)" + " : R$ " + fgts);
        System.out.println("Total de descontos" + " : R$ " + (salarioBruto - salarioLiquido));
        System.out.println("Salario liquido" + " : R$ " + salarioLiquido);


    }
}
