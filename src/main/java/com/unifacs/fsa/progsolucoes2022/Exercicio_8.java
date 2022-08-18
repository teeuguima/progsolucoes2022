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
public class Exercicio_8 {
    public static void main(String args[]){
        float eleitores, brancos, nulos, validos;
        float percentBrancos, percentNulos, percentValidos;
        Scanner key = new Scanner(System.in);
         
        System.out.println("Quantos eleitores? ");
        eleitores = key.nextInt();
        System.out.println("Quantos votos em branco?");
        brancos = key.nextInt();
        System.out.println("Quantos votos nulos?");
        nulos = key.nextInt();
        System.out.println("Quantos votos válidos?");
        validos = key.nextInt();
        
        percentBrancos = (brancos/eleitores)* 100;
        percentNulos = (nulos/eleitores)*100;
        percentValidos = (validos/eleitores)*100;
        
        System.out.println("Total de eleitores: " + eleitores+
                "\n"+ percentBrancos + "% votos foram em branco" +
                "\n" + percentNulos + "% votos foram nulos"+
                "\n" + percentValidos + "% votos foram válidos");;
    }
}
