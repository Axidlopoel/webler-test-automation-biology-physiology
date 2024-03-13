package hu.webler.domain;

import java.util.Arrays;

    public class Human extends LivingCreature implements HumanActivity, CommonActivity {         //extends kulcsszóval örököltethetjük

        private String gender;

        public Human() {

        }

        public Human(String name, int age, String[] colors, String gender) {
            super(name, age, colors);
            this.gender = gender;
        }

        @Override
        public void feed() {
            System.out.println("Human is being fed. Yum yum yum. Food food food.");
        }

        @Override
        public void speak() {
            System.out.println("Bla, bla, bla! Human is speaking");
        }

        @Override
        public void think() {
            System.out.println("I think therefore I am");
        }
        @Override
        public void move() {
            System.out.println("Human can move!");
        }

        @Override
        public void sleep() {
            System.out.println("Human sleeps at night!");
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Human{" +
                    "name='" + super.getName() + '\'' +
                    ", age='" + super.getAge() + '\'' +
                    ", colors='" + Arrays.toString(this.getColors()) + '\'' +
                    ", gender='" + gender + '\'' +
                    '}';
        }
    }