import java.util.Random;
import java.util.Scanner;

public class ConsumerMainTEST {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username: ");
        Consumer consumer = new Consumer(sc.nextLine());
        Random rand = new Random();
        int random = rand.nextInt(4);
        System.out.println("Enter the name of the artist you want to register to: ");
        consumer.register(consumer.getBrokers().get(random), sc.nextLine());
        consumer.requestSong();


    }
}