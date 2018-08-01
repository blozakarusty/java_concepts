package io;

import java.io.Serializable;

public class Coffee implements Serializable {

    private String name;
    private int strength;
    private transient String privateVariable = "This is private!";

    public Coffee(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", privateVariable='" + privateVariable + '\'' +
                '}';
    }
}
