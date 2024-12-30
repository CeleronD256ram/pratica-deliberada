package com.tiagovieira.exemplosDeUso;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ManualIterator {
    public static void main(String[] args) {

        ArrayList a1 = new ArrayList<>();

        a1.add("C");
        a1.add("A");
        a1.add("E");
        a1.add("B");
        a1.add("D");
        a1.add("F");

        // Usando o iterator para exibir o conteúdo do ArrayList
        System.out.println("Conteúdo do a1:");
        Iterator iterator = a1.iterator();

        while (iterator.hasNext()) {
            Object elemento = iterator.next();
            System.out.print(elemento + " ");

        }
        System.out.println();

        //Modifica objetos que estão sendo iterados
        ListIterator listIterator = a1.listIterator();
        while (listIterator.hasNext()) {
            Object elemento = listIterator.next();
            listIterator.set(elemento + "+");

        }

        System.out.println("Conteúdo modificado:");
        iterator = a1.iterator();
        while (iterator.hasNext()) {
            Object elemento = iterator.next();
            System.out.print(elemento + " ");

        }
        System.out.println();

        System.out.println("Lista modificada para trás: ");
        while (listIterator.hasPrevious()) {
            Object elemento = listIterator.previous();
            System.out.print(elemento + " ");

        }

    }


}
