package HomeTask;

import java.util.Scanner;

public class Doggie implements CheckDog {
    String name;
    int bellyful;
    int walking;
    int games;
    boolean feed;
    boolean walk;
    boolean game;
    int step1;
    int step2;
    int step3;
    int defaultBelly;
    int defaultWalk;
    int defaultGame;
    String breed;

    public Doggie() {
    }

    public Doggie(String username) {
        this.step1 = 5;
        this.step2 = 10;
        this.step3 = 13;
        this.name = username;
        this.bellyful = 1 + (int) (Math.random() * 100);
        this.walking = 1 + (int) (Math.random() * 100);
        this.games = 1 + (int) (Math.random() * 100);
        this.defaultBelly = 60;
        this.defaultWalk = 50;
        this.defaultGame = 40;
        this.breed = "N/A";
    }

    public String toString() {
        return("For "+name+","+breed+", now: bellyful = " + bellyful + ", walking = " + walking + ", games = " + games);}

    public void healthcheck() {
        System.out.println("Your dog is " + name + " it's " + breed);
        if (bellyful < defaultBelly) {
            System.out.println("Your dog is hungry! Do you wanna feed it? Type true or false.");
            Scanner scan = new Scanner(System.in);
            feed = scan.nextBoolean();
        } else {
            System.out.println("Your dog isn't hungry.");
            feed = false;
        }
        if (walking < defaultWalk) {
            System.out.println("Your dog wants to go outside. I'll walk your dog.");
            walk = true;
        } else {
            System.out.println("Your dog doesn't want to go outside.");
            walk = false;
        }
        if (games < defaultGame) {
            System.out.println("Your dog wants to play. I'll play with your dog.");
            game = true;
        } else {
            System.out.println("Your dog doesn't want to play.");
            game = false;
        }
    }

    public void feedDog() {
        if (feed) {
            while (bellyful < 95) {
                bellyful = bellyful + step1;
                System.out.println("bellyful is " + bellyful + " now.");
            }
        } else {
            System.out.println("Skip feeding.");
        }
    }

    public void walkDog() {
        if (walk) {
            while (walking < 90) {
                walking = walking + step2;
                System.out.println("walking is " + walking + " now.");
            }
        } else {
            System.out.println("Skip walking.");
        }
    }

    public void playDog() {
        if (game) {
            while (games < 87) {
                games = games + step3;
                System.out.println("games is " + games + " now.");
            }
        } else {
            System.out.println("Skip playing.");
        }
    }

    public void setName(String username) {
        this.name = username;
        while (name.isEmpty()) {
            System.out.println("Name cannot be empty!");
            Scanner again = new Scanner(System.in);
            this.name = again.nextLine();
        }
    }

}




