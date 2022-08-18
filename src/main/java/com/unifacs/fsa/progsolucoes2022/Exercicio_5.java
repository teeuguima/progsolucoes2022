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
public class Exercicio_5 {
    public static void main(String args[]){
        double base, altura, area;
        Scanner key = new Scanner(System.in);
        System.out.println("Digite a base do quadrado: ");
        base = key.nextDouble();
        System.out.println("Digite a altura do quadrado: ");
        altura = key.nextDouble();
        
        area = base * altura;
        System.out.println("A área do quadrado é: "+ area);
    }
}
