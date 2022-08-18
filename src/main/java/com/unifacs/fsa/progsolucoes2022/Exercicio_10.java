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
public class Exercicio_10 {
    public static void main(String args[]){
        float custo_fabrica, carro_novo;
        float percent_distribuidor = (float)0.28;
        float percent_impostos = (float)0.45;
        Scanner key = new Scanner(System.in);
        System.out.println("Qual é o valor do custo de fábrica? ");
        custo_fabrica = key.nextFloat();
        
        carro_novo = custo_fabrica + (custo_fabrica * percent_distribuidor) + (custo_fabrica * percent_impostos);
        System.out.println("O custo do carro novo é R$ "+ carro_novo);
        
    }
    
}
