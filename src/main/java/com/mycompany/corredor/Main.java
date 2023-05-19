/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.corredor;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author DAWTarde
 */
public class Main {

    public static void main(String[] args) {
        int size;
        AbstractList<Corredor> corredores;
        corredores = new ArrayList();
        corredores.add(new Corredor("Fali", "Ranse", 1, 2, 60, 2));
        corredores.add(new Corredor("Sanzhe", "falaran", 2, 3, 30, 3));
        corredores.add(new Corredor("Ramon", "Del sol", 3, 3, 30, 4));
        corredores.add(new Corredor("San", "Del puente", 4, 5, 30, 5));
        corredores.add(new Corredor("Felicia", "Polaran", 5, 8, 10, 6));
        //guardamos el tamaño de la lista
        size = corredores.size();
        System.out.print(size);

        Iterator<Corredor> it = corredores.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //clonado
        corredores.add(corredores.get(0).clone(corredores.get(0)));
        //se ha podido insertar sin problema
        //7
        int contador = 1;
        for (Corredor c : corredores) {
            c.setDorsal(contador);
            contador++;
        };
        //despues ordenar

        //shuffle de Collections para desordenar la lista corredores
        System.out.println("-------------------------------");
        Collections.shuffle(corredores);

        //muestra
        it = corredores.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //copia
        ArrayList<Corredor> copia = new ArrayList<>(corredores);

        System.out.println("-------------------------------");
        Collections.shuffle(corredores);
        System.out.println("Copiaaaaaaaaa");

        for (Corredor c : copia) {
            System.out.println(c);
        }

        //copia.so
        System.out.print(size);
        System.out.println("--------------------------------------------- Sorted copy");
        System.out.println(corredores.get(0).compareTo(corredores.get(1)));
    }
}
