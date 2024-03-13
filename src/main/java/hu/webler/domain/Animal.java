package hu.webler.domain;

import java.util.Arrays;

public class Animal extends LivingCreature implements AnimalActivity, CommonActivity {

    private String gender;

    public Animal() {

    }

    public Animal(String name, int age, String[] colors, String gender) {
        super(name, age, colors);
        this.gender = gender;
    }

    @Override
    public void feed() {
        System.out.println("Animal is being fed. Yum yum yum. Animal food :)");
    }

    @Override
    public void makeSound() {
        // implemementáció jöhet ide!
        System.out.println("Animal sound!");
    }

    @Override
    public void move() {
        System.out.println("Animal can move!");
    }

    @Override
    public void sleep() {
        System.out.println("Animal is sleeping!");
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "gender='" + gender + '\'' +
                '}';
    }
}