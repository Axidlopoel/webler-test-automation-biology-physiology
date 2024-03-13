package hu.webler.domain;

import java.util.Arrays;

public class Carnivore extends Animal implements ExtraActivity {

    public Carnivore() {

    }

    public Carnivore(String name, int age, String[] colors, String gender) {
        super(name, age, colors, gender);
    }

    @Override
    public void feed() {
        System.out.println("Eating meet! -> Carnivore");
    }

    @Override
    public void extraSomething() {
        System.out.println("It is extra only for carnivore!!!!");
    }

    @Override
    public String toString() {
        return "Carnivore{" +
                "name='" + super.getName() + '\'' +
                ", age='" + super.getAge() + '\'' +
                ", colors='" + Arrays.toString(this.getColors()) + '\'' +
                ", gender='" + super.getGender() + '\'' +
                '}';
    }
}