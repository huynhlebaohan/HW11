package OOPExercies2;

import java.util.Date;

public class ProcessorEx2 {

    public static void main(String[] args) {
        AnimalList animalList = new AnimalList();
        Dog dog1 = new Dog("D01", "Dagom", new Date(), "White", "Labrador");
        Cat cat1 = new Cat("C01", "Leo", new Date(), "Black");
        animalList.addAnimal(dog1);
        animalList.addAnimal(cat1);
        animalList.displayAll();
    }
}
