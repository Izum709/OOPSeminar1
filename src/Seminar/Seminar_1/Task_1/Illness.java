package Seminar.Seminar_1.Task_1;

public class Illness {
    public String illnessName;

    public Illness() {
    }
    public Illness(String illnessName) {
        this.illnessName = illnessName;
    }
    public void heal(){
        System.out.println("3 таблетки в день перед едой");
    }

    @Override
    public String toString() {
        return illnessName ;
    }
}
