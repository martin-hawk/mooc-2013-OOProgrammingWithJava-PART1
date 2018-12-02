/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Martynas Vanagas
 */
public class Bird {

    private String name;
    private String latinName;
    private int occurance;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.occurance = 0;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getOccurance() {
        return occurance;
    }

    public void addOccurance() {
        this.occurance++;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.occurance + " observations"; //To change body of generated methods, choose Tools | Templates.
    }
}
