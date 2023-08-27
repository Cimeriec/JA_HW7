package example2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
    Animal a = new Animal();
    File file = new File("D:\\Java\\1\\JA_HW7\\src\\example2\\animal.txt");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
            oos.writeObject(a);
            Animal newAnimal = (Animal) ois.readObject();
            System.out.println(newAnimal);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
