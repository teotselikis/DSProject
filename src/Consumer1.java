import java.util.Random;
import java.util.Scanner;

public class Consumer1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username: ");
        Consumer consumer1 = new Consumer(sc.nextLine());
        Random rand = new Random();
        int random = rand.nextInt(4);
        System.out.println("Enter the name of the artist you want to register to: ");
        consumer1.register(consumer1.getBrokers().get(random), sc.nextLine());
        consumer1.requestSong();
    }
}