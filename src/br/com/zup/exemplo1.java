package br.com.zup;

import java.util.Scanner;

public class exemplo1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Olá, sou agente do FBI");
        System.out.println("Vamos te fazer algumas perguntas.");
        System.out.println("Responda S para sim ou N para não");
        int contadorDeRespostas = 0;
        String resposta;

        System.out.println("Telefonou para a vítima?");
        resposta = leitor.nextLine();
        if(resposta.equals("S")){
            contadorDeRespostas = contadorDeRespostas + 1;
        }
        System.out.println("Esteve no local do crime?");
        resposta = leitor.nextLine();
        if(resposta.equals("S")){
            contadorDeRespostas = contadorDeRespostas + 1;
        }
        System.out.println("Mora perto da vítima?");
        resposta = leitor.nextLine();
        if(resposta.equals("S")){
            contadorDeRespostas = contadorDeRespostas + 1;
        }
        System.out.println("Devia para a vítima?");
        resposta = leitor.nextLine();
        if(resposta.equals("S")){
            contadorDeRespostas = contadorDeRespostas + 1;
        }
        System.out.println("Já trabalhou com a vítima?");
        resposta = leitor.nextLine();
        if(resposta.equals("S")){
            contadorDeRespostas = contadorDeRespostas + 1;
        }


        if(contadorDeRespostas == 2 ){
            System.out.println("Suspeito");
        }
        else if(contadorDeRespostas >=3 & contadorDeRespostas <=4){
            System.out.println("Cúmplice");
        }
        else if(contadorDeRespostas == 5){
            System.out.println("Suspeito");
        }else{
            System.out.println("Inocente");
        }

    }
}
