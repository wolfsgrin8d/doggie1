package HomeTask;
public class Terrier extends Doggie implements CheckDog {
    public Terrier(String name) {
        super();
        this.name = name;
        this.step1 = 4;
        this.step2 = 9;
        this.step3 = 12;
        this.bellyful = 1 + (int) (Math.random() * 100);
        this.walking = 1 + (int) (Math.random() * 100);
        this.games = 1 + (int) (Math.random() * 100);
        this.defaultBelly = 65;
        this.defaultWalk = 55;
        this.defaultGame = 45;
        this.breed = "Terrier";
    }
}


