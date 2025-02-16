package OOPExercies2;

import java.util.Date;

public class Animal {

    String id, source, color;
    Date dateOfBirth;

    public Animal(String id, String source, Date dateOfBirth, String color) {
        this.id = id;
        this.source = source;
        this.dateOfBirth = dateOfBirth;
        this.color = color;
    }

    void makeSound() {
        System.out.println("Animal sound");
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Source: " + source);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Color: " + color);
        makeSound();
    }
}
