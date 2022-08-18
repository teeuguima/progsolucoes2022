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
public class Exercicio_1 {
    public static void main(String args[]){
          double dolar, qtd, real;
          Scanner key = new Scanner(System.in);
          
          System.out.println("Quantos doláres você possui?");
          qtd = key.nextDouble();
          System.out.println("Qual a cotação do dólar em reais, atualmente?");
          dolar = key.nextDouble();
          real = dolar * qtd;
          System.out.println("Você possui R$ "+real+" , parabéns!!");
    }
}
