import java.sql.SQLOutput;
import java.util.Scanner;
public class Dog {
    public static void main(String[] args) {
        Doggie doggie1 = new Doggie();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type your dog's name, this is a required parameter");
        String doggieName = scanner.next();
        doggie1.setName(doggieName);
        doggie1.getInfo();
        doggie1.feedDog();
        doggie1.walkDog();
        doggie1.playDog();
    }

}
class Doggie {
    String name;
    int bellyful;
    int walking;
    int games;
    public Doggie(/*String username*/){
        /*this.name = username;*/
        this.bellyful = 1 +(int)(Math.random() * 100) ;
        this.walking = 1 +(int)(Math.random() * 100) ;
        this.games = 1 +(int)(Math.random() * 100) ;
    }
    public void setName(String username) {
        if(username.isEmpty()){
            System.out.println("Name cannot be empty!");
        } else {
            this.name = username;}}

    public void getInfo(){
        System.out.println(name +", bellyfull = "+bellyful+", walking = "+walking+", games = "+games);}

        int returnBellyFul(){
            return this.bellyful;
        }
        public void feedDog(){
            int a = this.bellyful;
            if (a<60){
                for(int i = a;  i < 100;i = i+5){
                    if(i > 95){
                        System.out.println("bellyful is "+i);
                        break;}
                    else{
                    System.out.println("bellyful is "+i);}
                }
            } else{
                System.out.println("Your dog was already full.");
            }

    }
            public void walkDog(){
                int b = this.walking;
                if (b<50){
                    for(int x = b;  x < 100;x = x+10){
                        if( x > 90){
                            System.out.println("walking is "+x);
                            break;}
                        else{
                            System.out.println("walking is "+x);}
                    }
                } else{
                    System.out.println("Your dog was already walked.");
                }

        }
    public void playDog(){
        int c = this.games;
        if (c<40){
            for(int y = c;  y < 100;y = y+10){
                if( y > 87){
                    System.out.println("playing is "+y);
                    break;}
                else{
                    System.out.println("playing is "+y);}
            }
        } else{
            System.out.println("Your dog was already played with.");
        }

    }


}
