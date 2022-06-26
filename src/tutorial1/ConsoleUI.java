package tutorial1;

import java.util.Scanner;

public class ConsoleUI implements UI{

    private Scanner sc;

    public ConsoleUI() {
        this.sc = new Scanner(System.in);
    }

    public String enterName() {
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        return name;
    }

    public int enterGuess() {
        System.out.print("Enter your guess: ");
        return this.sc.nextInt();
    }

    public void guessTooHigh() {
        System.out.println("Too high!");
    }

    public void guessTooLow() {
        System.out.println("Too low!");
    }

    public void livesCheck(int lives) {
        System.out.println("You have " + lives + " lives left!");
    }

    public void displayAnswer(int answer) {
        System.out.println("The answer was " + answer);
    }

    public void winMessage(String name) {
        System.out.println("Congrats " + name + ", you won!");
    }

    public void loseMessage(String name) {
        System.out.println("Oh no " + name + "! You lose!");
    }
  
}
