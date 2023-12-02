package Seminar.Seminar_1.Task_1;

import java.time.LocalDate;

public class Animal {
    private String ownerName;
    private String address;
    private int phoneNumber;
    private String animalName;
    private String animalClass;
    private LocalDate animalBirthday;
    private String animalColor;
    private Illness animalIllness;

    public Animal() {
    }

    public Animal(String ownerName, String address, int phoneNumber,
                  String animalName, String animalClass,
                  LocalDate animalBirthday, String animalColor,
                  Illness animalIllness) {
        this.ownerName = ownerName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.animalName = animalName;
        this.animalClass = animalClass;
        this.animalBirthday = animalBirthday;
        this.animalColor = animalColor;
        this.animalIllness = animalIllness;

    }
    public void setAnimalName(String name){
        this.animalName = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalClass() {
        return animalClass;
    }

    public void setAnimalClass(String animalClass) {
        this.animalClass = animalClass;
    }

    public LocalDate getAnimalBirthday() {
        return animalBirthday;
    }

    public void setAnimalBirthday(LocalDate animalBirthday) {
        this.animalBirthday = animalBirthday;
    }

    public String getAnimalColor() {
        return animalColor;
    }

    public void setAnimalColor(String animalColor) {
        this.animalColor = animalColor;
    }

    public Illness getAnimalIllness() {
        return animalIllness;
    }

    public void setAnimalIllness(Illness animalIllness) {
        this.animalIllness = animalIllness;
    }
    private void wakeUp(){
        System.out.println("Животное проснулось");
    }
    private void wakeUp(String time){
        System.out.println(getClass().getSimpleName()+" проснулось в "+time);
    }
    private void eat(){
        System.out.println(getClass().getSimpleName()+" Кормление");
    }
    private void play(){
        System.out.println(getClass().getSimpleName()+" Играет");
    }
    private void sleep(){
        System.out.println(getClass().getSimpleName()+" Спит");
    }
    public void liveCycle(){
        wakeUp();
        eat();
        play();
        sleep();
    }
    public static void foo(){
        System.out.println("Вызывается метод этот не от имени экземпляра класса а от имени класса самого");
    }
}
