package metier;

import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class MontagneMain {
    public static void main(String[] args) {
        List<Sommet> sommets = new ArrayList<>();
        sommets.add(new Sommet("Mont Blanc", 4809, ChaineDeMontagne.MONT_BLANC) );
        sommets.add(new Sommet("Aiguille des Grands Montets", 3295, ChaineDeMontagne.MONT_BLANC));
        sommets.add(new Sommet("La Rhune", 409, ChaineDeMontagne.PYRENEES));
        sommets.add(new Sommet("Pic du Midi", 2877, ChaineDeMontagne.PYRENEES));
        sommets.add(new Sommet("Pic d'Aneto", 3404, ChaineDeMontagne.PYRENEES));
        sommets.add(new Sommet("Pic du Canigou", 2785, ChaineDeMontagne.PYRENEES));
        sommets.add(new Sommet("Puy de Sancy", 1579, ChaineDeMontagne.MASSIF_CENTRAL));
        sommets.add(new Sommet("Puy de Dôme", 1465, ChaineDeMontagne.MASSIF_CENTRAL));
        sommets.add(new Sommet("Le Grand Ballon", 1424, ChaineDeMontagne.MASSIF_CENTRAL));


        Collections.sort(sommets, new ComparateurAltitude());
        Collections.sort(sommets, new ComparateurAltitude());

        System.out.println("Mes sommets :");
        for (Sommet sommet : sommets) {
            System.out.println(sommet.getDescription());
        }


    }
}
