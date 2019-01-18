/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalez00;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class JavaLez01_Bis {

    //leggere in input due numeri interi e stampare il più alto dei due
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("inserisci il primo numero: ");
        int op1 = s.nextInt();

        System.out.println("inserisci il secondo numero: ");
        int op2 = s.nextInt();

        if (op1 == op2) {
            System.out.println("I numeri sono uguali!!");
        } else {
            if (op1 > op2) {
                System.out.println("Il più grande è:" + op1);
            } else {
                System.out.println("Il più grande è:" + op2);
            }

        }

    }
}
