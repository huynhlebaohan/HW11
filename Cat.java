package OOPExercies2;

import java.util.Date;

public class Cat extends Animal {

    public Cat(String id, String source, Date dateOfBirth, String color) {
        super(id, source, dateOfBirth, color);
    }

    @Override
    void makeSound() {
        System.out.println("meo meo");
    }
}
