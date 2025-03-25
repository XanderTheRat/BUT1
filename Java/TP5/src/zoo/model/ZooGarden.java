package zoo.model;
import zoo.model.animal.*;
import zoo.model.visitor.*;

import java.util.ArrayList;

public class ZooGarden {

    private ArrayList<Animal> animals;
    private ArrayList<Visitor> visitors;

    public ZooGarden() {
        this.animals = new ArrayList<>();
        this.visitors = new ArrayList<>();
    }

    public void add(Animal... animals) {
        for (Animal animal : animals) {
            this.animals.add(animal);
        }
    }

    public void add(Visitor visitor) {
        visitors.add(visitor);
    }

    public void makeNoise() {
        for (Animal animal : animals) {
            System.out.println(animal.name() + " : " + animal.noise());
        }

        for (Visitor visitor : visitors) {
            if (visitor instanceof Baby)
                System.out.println(((Baby) visitor).noise());
        }

        // Si vous avez une version du JDK >=16
        // vous pouvez remplacer le code précédent par celui-là
        /*
         * for (Visitor visitor : visitors) {
         *	if (visitor instanceof Baby baby)
         * 		System.out.println(baby.noise()); }
         */
    }

    public void sayHello() {
        for (Visitor visitor : visitors) {
            System.out.println(visitor.sayHello());
        }
    }

    public Integer detailRevenue() {
        Integer revenue = 0;
        for (Visitor visitor : visitors) {
            System.out.println(visitor.whoAmI() + " : " + visitor.priceOfTicket() + " Euros");
            revenue = revenue + visitor.priceOfTicket();
        }

        return revenue;
    }

}