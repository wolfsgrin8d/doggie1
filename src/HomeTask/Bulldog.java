package HomeTask;
public class Bulldog extends Doggie implements CheckDog {
    public Bulldog(String name) {
        super();
        this.name = name;
        this.step1 = 5;
        this.step2 = 10;
        this.step3 = 13;
        this.bellyful = 1 + (int) (Math.random() * 100);
        this.walking = 1 + (int) (Math.random() * 100);
        this.games = 1 + (int) (Math.random() * 100);
        this.defaultBelly = 60;
        this.defaultWalk = 50;
        this.defaultGame = 40;
        this.breed = "Bulldog";
    }


}


