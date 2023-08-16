import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Howdy, what's your name");
        System.out.println("(type in your name) ");

        Scanner input = new Scanner(System.in);
        
        String name = input.nextLine();
    }
}