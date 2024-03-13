package hu.webler.domain;

import java.util.Arrays;

public class Omnivore extends Animal{

    public Omnivore() {

    }

    public Omnivore(String name, int age, String[] colors, String gender) {
        super(name, age, colors, gender);
    }

    @Override
    public void feed() {
        System.out.println("Eating plants and meet!");
    }

    @Override
    public String toString() {
        return "Omnivore{" +
                "name='" + super.getName() + '\'' +
                ", age='" + super.getAge() + '\'' +
                ", colors='" + Arrays.toString(this.getColors()) + '\'' +
                ", gender='" + super.getGender() + '\'' +
                '}';
    }
}
