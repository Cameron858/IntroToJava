package tutorial1;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Implements a simple random number guessing game.
 */
public class RandomNumberGuesser {

    private int min;
    private int max;
    private int lives;
    private UI ui;

    /**
     * 
     * @param min Minimum random number the answer can be.
     * @param max Maximum random number the answer can be.
     * @param lives Number of attempts the user has to guess the answer
     * @param ui UI child class for displaying messages to user
     */
    public RandomNumberGuesser(int min, int max, int lives, UI ui) {
        this.min = min;
        this.max = max;
        this.lives = lives;
        this.ui = ui;
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


            // check if user has lost
            if (this.lives <= 0) {
                this.ui.loseMessage(name);
                this.ui.displayAnswer(answer);
                break;
            }
            
            // get next guess and compare to answer
            guess = this.ui.enterGuess();
            
            if (guess == answer) {
                this.ui.winMessage(name);
                break;
            } else if (guess > answer) {
                this.ui.guessTooHigh();
            } else if (guess < answer) {
                this.ui.guessTooHigh();
            }
            
            this.lives--;
            this.ui.livesCheck(this.lives);

        } while (true);
        
        // explicilty closes scanner
        sc.close();
    }

    
    /** 
     * Gets the users username
     * @param sc
     * @return String
     */
    private String GetUsername(Scanner sc) {
        return this.ui.enterName();
    }

}
