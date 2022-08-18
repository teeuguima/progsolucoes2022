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
public class Exercicio_6 {
    public static void main(String args[]){
        Scanner key = new Scanner(System.in);
        int idade, idade_dias;
        System.out.println("Qual sua idade? ");
        idade = key.nextInt();
        
        idade_dias = idade * 365;
        System.out.println("Você tem "+ idade_dias+ " dias de idade");
    }
    
}
