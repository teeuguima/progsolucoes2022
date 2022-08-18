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
public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
      int num1, num2, num3, num4;
      
      System.out.println("Numero 1");
      num1 = key.nextInt();
      System.out.println("Numero 2");
      num2 = key.nextInt();
      System.out.println("Numero 3");
      num3 = key.nextInt();
      System.out.println("Numero 4");
      num4 = key.nextInt();
      
      int quadrados = (num1*num1) + (num2*num2) + (num3*num3) + (num4*num4);
      
      System.out.println("Resultado: " + quadrados);
      
    }
    public static void printarVariavel(int x, int y){
          int z = x + y;
          System.out.println("Valores da soma de X e Y = R$" + z +  ",00" );
    };
}