package Seminar.Seminar_1.Task_1;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
         Cat cat = new Cat();
         cat.setAnimalName("barsic");
        System.out.println(cat.getAnimalName());
        Dog dog = new Dog("Sergey", "voronezh",
                123456789, "vasilek",
                "dog", LocalDate.of(2022,11,30),
                "red", new ORV("orv"));
        System.out.println(dog.getAnimalName()+"\n"+dog.getAnimalIllness());
        dog.getAnimalIllness().heal();
        //dog.wakeUp();
        //dog.wakeUp("10.00");
        List<Animal> animalList = new ArrayList<>();
        animalList.add(cat);
        animalList.add(dog);
        cat.liveCycle();
        Animal.foo();
    }

}
