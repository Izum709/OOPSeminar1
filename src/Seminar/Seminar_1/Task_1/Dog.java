package Seminar.Seminar_1.Task_1;

import java.time.LocalDate;

public class Dog extends Animal{
    public Dog() {
        super();
    }

    public Dog(String ownerName, String address, int phoneNumber, String animalName, String animalClass,
               LocalDate animalBirthday, String animalColor, Illness animalIllness) {
        super(ownerName, address, phoneNumber, animalName, animalClass,
                animalBirthday, animalColor, animalIllness);
    }
}
