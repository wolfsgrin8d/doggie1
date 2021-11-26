package HomeTask;

import java.util.Scanner;

public class Spaniel extends Doggie implements CheckDog{
public Spaniel(String name){
    super();
    this.name = name;
        this.step1 = 6;
       this.step2 = 11;
        this.step3 = 14;
    this.bellyful = 1 + (int) (Math.random() * 100);
    this.walking = 1 + (int) (Math.random() * 100);
    this.games = 1 + (int) (Math.random() * 100);
    this.defaultBelly = 55;
    this.defaultWalk = 45;
    this.defaultGame = 35;
    this.breed = "Spaniel";
    }
    public String toString() {
        return("For "+name+","+breed+", now: bellyful = " + bellyful + ", walking = " + walking + ", games = " + games);}

}
