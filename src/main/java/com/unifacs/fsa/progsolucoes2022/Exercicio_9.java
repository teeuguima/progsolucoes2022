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
public class Exercicio_9 {
    public static void main(String args[]){
        float salario_mensal, percentual, novo_salario;
        Scanner key = new Scanner(System.in);
        
        System.out.println("Qual é o valor do seu salário mensal? ");
        salario_mensal = key.nextFloat();
        System.out.println("Qual o valor do percentual?");
        percentual = key.nextFloat();
        
        novo_salario = (salario_mensal * (percentual/100)) + salario_mensal;
        System.out.println("Seu novo salário é: R$"+novo_salario);
        
                            
    }
}
