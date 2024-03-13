package hu.webler.domain;

import java.util.Arrays;

public class Plant extends LivingCreature {

    public Plant() {

    }

    public Plant(String name, int age, String[] colors) {
        super(name, age, colors);
    }


    @Override
    void feed() {
        System.out.println("Plant is being fed. Yum yum yum. Water water water!");
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + super.getName() + '\'' +
                ", age='" + super.getAge() + '\'' +
                ", colors='" + Arrays.toString(this.getColors()) + '\'' +
                '}';
    }
}
