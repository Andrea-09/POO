package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        List lista = new ArrayList<Integer>();

        for(int i = 0; i < 100; i++){
            if(i % 2 == 0){
                int[] arra = new int[i];
                System.out.println("Pares: " + i);
            }
            else
               lista.add(i);
        }
        Iterator iterador = lista.iterator();
        while (iterador.hasNext()){
            System.out.println("Impares: " + iterador);
        }
        System.out.println("Bai");
    }
}
