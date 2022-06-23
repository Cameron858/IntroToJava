package tutorial1;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Implements a simple random number guess game.
 */
public class RandomNumberGuesser {

    private int min;
    private int max;
    private int lives;

    /**
     * 
     * @param min Minimum random number the answer can be.
     * @param max Maximum random number the answer can be.
     * @param lives Number of attempts the user has to guess the answer
     */
    public RandomNumberGuesser(int min, int max, int lives) {
        this.min = min;
        this.max = max;
        this.lives = lives;
    }

    /**
     * Runs the game.
     */
    public void play() {

        Scanner sc = new Scanner(System.in);
        String name = this.GetUsername(sc);
        int guess;
        int answer = ThreadLocalRandom.current().nextInt(this.min, this.max + 1); // sets random integer to between min and max values
        
        // do while contains main game loop
        do {

            if (this.lives <= 0) {
                System.out.println("You ran out of lives!");
                System.out.println("The answer was " + answer);
                break;
            }

            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess == answer) {
                System.out.println("Congrats " + name + ", you won!");
                break;
            } else if (guess > answer) {
                System.out.println("Too high!");
            } else if (guess < answer) {
                System.out.println("Too low!");
            }
            
            this.lives--;
            System.out.println("You have " + this.lives + " lives left!");

        } while (true);
        
        // explicilty closes scanner
        sc.close();
    }

    
    /** 
     * @param sc
     * @return String
     */
    private String GetUsername(Scanner sc) {
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        return name;
    }

}
