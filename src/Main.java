import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = GetName(sc);
        int answer = ThreadLocalRandom.current().nextInt(0, 11); // sets random integer to 0 -> 10 inclusive
        int guess;
        int guesses = 0;

        do {
            System.out.println("Guess a number between 0 and 10: ");
            guess = sc.nextInt();
            guesses++;
        } while (guess != answer);

        PrintFinalMessage(name, guesses, answer);

        sc.close();
    }

    public static String GetName(Scanner sc) {

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        return name;
    }

    public static void PrintFinalMessage(String name, int guesses, int answer) {
        System.out.println("Well done " + name + "!");
        System.out.println("You had " + guesses + " guesses!");
        System.out.println("The answer was " + answer + "!");
    }
}
