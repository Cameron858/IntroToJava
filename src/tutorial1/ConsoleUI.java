package tutorial1;

public class ConsoleUI implements UI{

    public void enterName() {
        System.out.print("Enter your name: ");
    }

    public void enterGuess() {
        System.out.print("Enter your guess: ");
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
