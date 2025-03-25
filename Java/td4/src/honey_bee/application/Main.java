package honey_bee.application;
import java.util.ArrayList;
import java.util.List;

import honey_bee.gui.Console;
import honey_bee.model.*;

public class Main {
    public static Integer nbQueens = 0;
    public static Integer nbWorkers = 0;
    public static Integer nbDrones = 0;
    private static void arrayOfHoneyBee(HoneyBee[] honeyBees){
        Console.message("Honey Bee by arrayOfHoneyBee");
        for (HoneyBee honeyBee : honeyBees) {
            Console.message(honeyBee.doYourJob());
        }
        Console.message("\n");
        for (HoneyBee honeyBee : honeyBees) {
            Console.message(honeyBee.fly());
        }
    }

    private static void collectionOfHoneyBee(HoneyBee[] honeyBees){
        Console.message("Honey Bee by collectionOfHoneyBee");
        for (HoneyBee honeyBee : honeyBees) {
            Console.message(honeyBee.doYourJob());
            switch (honeyBee) {
                case Queen queen -> nbQueens += 1;
                case Worker worker -> nbWorkers += 1;
                case Drone drone -> nbDrones += 1;
                default -> Console.message("Error");
            }
        }
        Console.message("\n");
        for (HoneyBee honeyBee : honeyBees) {
            Console.message(honeyBee.fly());
        }

        Console.message("My collection have" + honeyBees.length + " bees");
        Console.message(nbQueens + " queen(s)");
        Console.message(nbWorkers + " worker(s)");
        Console.message(nbDrones + " drone(s)");
    }

    public static void main(String[] args) {
        HoneyBee queen = new Queen("Mellifera");
        HoneyBee firstWorker = new Worker("Maya");
        HoneyBee secondWorker = new Worker("Marguerite");
        HoneyBee thirdWorker = new Worker("Propolis");
        HoneyBee firstDrone = new Drone("Willy");
        HoneyBee secondDrone = new Drone("Didier");

        Console.message("\n");

        List<HoneyBee> honeyBees = new ArrayList<>();
        honeyBees.add(queen);
        honeyBees.add(firstWorker);
        honeyBees.add(secondWorker);
        honeyBees.add(thirdWorker);
        honeyBees.add(firstDrone);
        honeyBees.add(secondDrone);

        arrayOfHoneyBee(honeyBees.toArray(new HoneyBee[honeyBees.size()]));
        Console.message("\n");
        collectionOfHoneyBee(honeyBees.toArray(new HoneyBee[0]));
    }
}