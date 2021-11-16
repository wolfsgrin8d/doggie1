import java.sql.SQLOutput;
import java.util.Scanner;

public class MainDog {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please type your dog's name, this is a required parameter");
            String doggieName = scanner.nextLine();
            Doggie doggie1 = new Doggie(doggieName);
            doggie1.setName(doggieName);
            doggie1.getInfo();
            doggie1.healthcheck();
            doggie1.feedDog();
            doggie1.walkDog();
            doggie1.playDog();
            doggie1.getInfo();
        }

    }

