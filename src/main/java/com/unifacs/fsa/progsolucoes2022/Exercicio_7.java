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
public class Exercicio_7 {
    public static void main(String args[]){
        Scanner key = new Scanner(System.in);
        int anos, meses, dias, total_dias;
        String idade;
        String[] idade_split;
       
        
        
        System.out.println("Quantos anos, meses e dias de vida você tem?");
        idade = key.next();
        idade_split = idade.split(" ");
        anos = Integer.parseInt(idade_split[0]);
        meses = Integer.parseInt(idade_split[1]);
        dias = Integer.parseInt(idade_split[2]);
        
        total_dias = anos * 365 + meses * 30 + dias;
        System.out.println("Sua idade completa em dias: "+total_dias);
    }
}
