import HomeTask.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainDog {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please type your Bulldog's name, this is a required parameter");
            String doggieName1 = scanner.nextLine();
            CheckDog bulldog = new Bulldog(doggieName1);
            bulldog.setName(doggieName1);
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Please type your Spaniel's name, this is a required parameter");
            String doggieName2 = scanner.nextLine();
            CheckDog spaniel = new Spaniel(doggieName2);
            spaniel.setName(doggieName2);
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Please type your Terrier's name, this is a required parameter");
            String doggieName3 = scanner.nextLine();
            CheckDog terrier = new Terrier(doggieName3);
            terrier.setName(doggieName3);
            List<Doggie> dogs = new ArrayList();
            dogs.add((Doggie) bulldog);
            dogs.add((Doggie) spaniel);
            dogs.add((Doggie) terrier);
            System.out.println(dogs);
            bulldog.healthcheck();
            bulldog.feedDog();
            bulldog.playDog();
            bulldog.walkDog();
            spaniel.healthcheck();
            spaniel.feedDog();
            spaniel.playDog();
            spaniel.walkDog();
            terrier.healthcheck();
            terrier.feedDog();
            terrier.playDog();
            terrier.walkDog();
            getInformation(dogs);

        }
            private static void getInformation (List < ? extends Doggie > dogs1){
                for (Doggie doggie : dogs1) {
                    System.out.println(doggie);
                }
            }

        }



