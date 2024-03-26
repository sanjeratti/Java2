package oop;

public class Dog {

        //Instance variable / fields
        public String name; // = "Rex";

        public int age;// = 3;

        public String breed ;//= "Ovcharka";

        public String color;// = "Black";

        public String eat(){

            return "Eat-eat";
        }
        public String bark(){return "Gav-gav";}
        public String run() { return "run"; }

        @Override
        public String toString() {
                return "Dog{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        ", breed='" + breed + '\'' +
                        ", color='" + color + '\'' +
                        '}';
        }
}
