
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Martynas Vanagas
 */
public class Birdwatch {

    ArrayList<Bird> birdwatch;

    public Birdwatch() {
        this.birdwatch = new ArrayList<Bird>();
    }

    public void addBird(String name, String latinName) {
        this.birdwatch.add(new Bird(name, latinName));
    }

    public boolean addObservation(String name) {
        for (Bird bird : this.birdwatch) {
            if (bird.getName().equals(name)) {
                bird.addOccurance();
                return true;
            }
        }
        return false;
    }

    public void printStatistics() {
        for (Bird bird : birdwatch) {
            System.out.println(bird);
        }
    }

    public void showBird(String name) {
        for (Bird bird : birdwatch) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
            }
        }
    }

}
