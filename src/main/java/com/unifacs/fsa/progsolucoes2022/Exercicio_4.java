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
public class Exercicio_4 {
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        int inteiro = key.nextInt();
        int antecessor = inteiro - 1;
        System.out.println("Seu antecessor: "+ antecessor);
           
    }
}
