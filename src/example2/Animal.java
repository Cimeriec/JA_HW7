package example2;

import java.io.Serializable;

public class Animal implements Serializable {
    public String breed = "Sphinx";
    int age = 5;
    private String name = "Barsik";

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
