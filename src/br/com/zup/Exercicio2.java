package br.com.zup;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double litrosVendidos = 0;
        String tipoDeCombustivel;
        double valorDaGasolina = 2.5;
        double valorDoAlcool = 1.9;
        double descontoGasolina = 0;
        double descontoAlcool = 0;
        double valorDaGasolinaComDesconto = 0;
        double valorDoAlcoolComDesconto = 0;

        System.out.println("Selecione o tipo de combustível: G para gasolina e A para álcool");
        tipoDeCombustivel = leitor.next();
        System.out.println("Digite a quantidade de litros: ");
        litrosVendidos = leitor.nextDouble();

        if (litrosVendidos >= 0 & tipoDeCombustivel.equals("G") | tipoDeCombustivel.equals("A")) {


            if (tipoDeCombustivel.equals("G")) {
                if (litrosVendidos > 0 & litrosVendidos <= 20) {
                    descontoGasolina = (valorDaGasolina * 0.03);
                    valorDaGasolinaComDesconto = valorDaGasolina - descontoGasolina;
                    System.out.println("O valor a pagar seria de: R$ " + (litrosVendidos * valorDaGasolina));
                    System.out.println("Como você abasteceu até 20l seu desconto foi de: R$ " + descontoGasolina + "Por litro");
                    System.out.println("O valor a ser pago será de: " + litrosVendidos * valorDaGasolinaComDesconto);
                } else {
                    descontoGasolina = (valorDaGasolina * 0.05);
                    valorDaGasolinaComDesconto = valorDaGasolina - descontoGasolina;
                    System.out.println("O valor a pagar seria de: R$ " + litrosVendidos * valorDaGasolina);
                    System.out.println("Como você abasteceu acima de 20l seu desconto foi de: R$ " + descontoGasolina + "Por litro");
                    System.out.println("O valor a ser pago será de: " + litrosVendidos * valorDaGasolinaComDesconto);

                }
            }


            if (tipoDeCombustivel.equals("A")) {
                if (litrosVendidos > 0 & litrosVendidos <= 20) {
                    descontoAlcool = (valorDoAlcool * 0.03);
                    valorDoAlcoolComDesconto = valorDoAlcool - descontoAlcool;
                    System.out.println("O valor a pagar seria de: R$ " + litrosVendidos * valorDoAlcool);
                    System.out.println("Como você abasteceu até 20l seu desconto foi de: R$ " + descontoAlcool + "Por litro");
                    System.out.println("O valor a ser pago será de: " + litrosVendidos * valorDoAlcoolComDesconto);
                } else {
                    descontoAlcool = (valorDoAlcool * 0.05);
                    valorDoAlcoolComDesconto = valorDoAlcool - descontoAlcool;
                    System.out.println("O valor a pagar seria de: R$ " + litrosVendidos * valorDoAlcool);
                    System.out.println("Como você abasteceu até 20l seu desconto foi de: R$ " + descontoAlcool + "Por litro");
                    System.out.println("O valor a ser pago será de: " + litrosVendidos * valorDoAlcoolComDesconto);
                }
            }


        } else {
            System.out.println("Por favor digite dados válidos");
        }
    }
}
