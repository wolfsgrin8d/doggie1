
import java.lang.constant.Constable;
import java.sql.SQLOutput;
import java.util.Scanner;

class Doggie {
    private String name;
    int bellyful;
    int walking;
    int games;
    boolean feed;
    boolean walk;
    boolean game;
    private int step1 = 5;
    private int step2 = 10;
    private int step3 = 13;

    public Doggie(String username) {
        this.name = username;
        this.bellyful = 1 + (int) (Math.random() * 100);
        this.walking = 1 + (int) (Math.random() * 100);
        this.games = 1 + (int) (Math.random() * 100);
    }

    public void setName(String username) {
        this.name = username;
        while (name.isEmpty()) {
            System.out.println("Name cannot be empty!");
            Scanner again = new Scanner(System.in);
            this.name = again.nextLine();
        }
    }

    public void getInfo() {
        System.out.println(name + ", bellyfull = " + bellyful + ", walking = " + walking + ", games = " + games);
    }

    public void healthcheck() {
        if (bellyful < 60) {
            System.out.println("Your dog is hungry! Do you wanna feed it? Type true or false.");
            Scanner scan = new Scanner(System.in);
            feed = scan.nextBoolean();
        } else {
            System.out.println("Your dog isn't hungry.");
            feed = false;
        }
        if (walking < 50) {
            System.out.println("Your dog wants to go outside. I'll walk your dog.");
            walk = true;
        } else {
            System.out.println("Your dog doesn't want to go outside.");
            walk = false;
        }
        if (games < 40) {
            System.out.println("Your dog wants to play. I'll play with your dog.");
            game = true;
        } else {
            System.out.println("Your dog doesn't want to play.");
            game = false;
        }
    }

    public void feedDog() { // разбить на два метода, хелс чек и кормить
        if (feed) {
            while (bellyful < 96) {
                bellyful = bellyful + step1;
                System.out.println("bellyful is " + bellyful + " now.");
            }
        } else {
            System.out.println("Skip feeding.");
        }
    }

    public void walkDog() {
        if (walk) {
            while (walking < 91) {
                walking = walking + step2;
                System.out.println("walking is " + walking + " now.");
            }
        } else {
            System.out.println("Skip walking.");
        }
    }

    public void playDog() {
        if (game) {
            while (games < 88) {
                games = games + step3;
                System.out.println("games is " + games + " now.");
            }
        } else {
            System.out.println("Skip playing.");
        }
    }
}




