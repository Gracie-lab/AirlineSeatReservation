import java.util.Scanner;
import java.util.Random;
public class Airline {
    public static void main(String... args){
    Scanner input = new Scanner(System.in);
    System.out.println("Type 1 for first class, Type 2 for economy ");
    int section = input.nextInt();
    boolean[] seats = new boolean[10];
    Random rand = new Random();
    if (section == 1){
        boolean randomSeat = seats[rand.nextInt(5)];
        System.out.println();

    }



    }
}
