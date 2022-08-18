/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unifacs.fsa.progsolucoes2022;

/**
 *
 * @author Mateus Guimarães
 */
import java.util.Scanner;
public class Exercicio_11 {
    public static void main(String args[]){
        Scanner key = new Scanner(System.in);
        int qtd_carros;
        float total_vendas, salario, comissao, salario_final;
        
        System.out.println("Qual foi a quantidade de carros vendidos?");
        qtd_carros = key.nextInt();
        System.out.println("Qual o valor total de suas vendas?");
        total_vendas = key.nextFloat();
        System.out.println("Qual valor do salário que você recebe?");
        salario = key.nextFloat();
        System.out.println("Qual valor da comissão que você ganha?");
        comissao = key.nextFloat();
        
        salario_final = salario + (qtd_carros*comissao) + ((float)0.05*total_vendas);
        System.out.println("Você recebe um salário final de R$ "+salario_final);
    }
}
