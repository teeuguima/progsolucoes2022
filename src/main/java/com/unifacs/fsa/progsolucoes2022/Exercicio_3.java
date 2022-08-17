/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.unifacs.fsa.progsolucoes2022;

/**
 *
 * @author Mateus Tecno
 */
import java.util.Scanner;
public class Exercicio_3 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        double preco;
        double comissao;
        int quantidade;
        System.out.println("Qual o preço unitário?");
        preco = key.nextDouble();
        System.out.println("Qual a quantidade vendida?");
        quantidade = key.nextInt();
        
        comissao = (preco * quantidade) * 0.05;
        System.out.println("Sua comissão é: R$ " + comissao);
        
    }
}
