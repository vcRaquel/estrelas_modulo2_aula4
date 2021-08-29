package br.com.zup;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Olá! Estamos fazendo uma investigação.");
        System.out.println("Responda as perguntas a seguir com S para sim ou N para não:");
        int contadorRespostas = 0;
        String resposta;

        System.out.println("Telefonou para a vítima?");
        resposta = leitor.nextLine();
        if (resposta.equals("S")){
            contadorRespostas += +1;
        }

        System.out.println("Esteve no local do crime?");
        resposta = leitor.nextLine();
        if (resposta.equals("S")){
            contadorRespostas += +1;
        }

        System.out.println("Mora perto da vítima?");
        resposta = leitor.nextLine();
        if (resposta.equals("S")){
            contadorRespostas += +1;
        }

        System.out.println("Devia para a vítima?");
        resposta = leitor.nextLine();
        if (resposta.equals("S")){
            contadorRespostas += +1;
        }

        System.out.println("Já trabalhou com a vítima?");
        resposta = leitor.nextLine();
        if (resposta.equals("S")){
            contadorRespostas += +1;
        }

        switch (contadorRespostas){
            case 2:
                System.out.println("Suspeito");
                break;
            case 3:
                System.out.println("Cúmplice");
                break;
            case 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assassino");
                break;
            default:
                System.out.println("inocente");
                break;
        }
    }
}
