import java.util.Scanner;
import java.util.Random;
public class Airline {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type 1 for first class, Type 2 for economy ");
        int section = input.nextInt();
        int[] seatFirst = {1, 2, 3, 4, 5};
        int[] seatEconomy = {6, 7, 8, 9, 10};
        Random rand = new Random();
        if (section == 1) {
            int randomSeat = (seatFirst[rand.nextInt(5)]);
            System.out.println("BOARDING PASS");
            System.out.println("Seat no: " + randomSeat);
            System.out.println("Class section: First class");
        }
        if (section == 2) {
            int randomSeat = (seatEconomy[rand.nextInt(5)]);
            System.out.println("BOARDING PASS");
            System.out.println("Seat no: " + randomSeat);
            System.out.println("Class section: Economy");

        }
    }
}