package tutorial1;

public interface UI {

    public void enterName();

    public void enterGuess();

    public void guessTooHigh();

    public void guessTooLow();

    public void livesCheck(int lives);

    public void displayAnswer(int answer);

    public void winMessage(String name);

    public void loseMessage(String name);

}
