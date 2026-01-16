import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class Sonnet {
    private int numIncorrectGuesses; // This keeps track of the number of incorrect guesses for this instance
    private int numCorrectGuesses; // This keeps track of the number of correct guesses for this instance
    private final ArrayList<String> sonnetStringArray;  // This is the sonnet split word by word in an array
    public Sonnet(String sonnetString) {
        this.numIncorrectGuesses = 0;
        this.numCorrectGuesses = 0;
        this.sonnetStringArray = Main.splitStringToWords(sonnetString);
    }

    public boolean startPritheeGame(){
        // Prints the sonnet string word by word until
        int stoppedIndexInSonnet = new Random().nextInt(sonnetStringArray.size());
        printSonnetString(stoppedIndexInSonnet);
        Scanner sc = new Scanner(System.in);
        boolean guessOutput;

        while (numIncorrectGuesses < 3 && numCorrectGuesses < 3){
            String curCorrectGuess = sonnetStringArray.get(stoppedIndexInSonnet);
            guessOutput = getGuess(curCorrectGuess,sc);
            if (guessOutput){
                stoppedIndexInSonnet++;
                printSonnetString(stoppedIndexInSonnet);
                numCorrectGuesses++;
                System.out.println("You guessed Correctly, you now have "+numCorrectGuesses+" correct guesses.");
            }else{
                numIncorrectGuesses++;
                System.out.println("You guessed Incorrectly, you now have "+(3-numIncorrectGuesses)+" incorrect guesses left." );
            }
        }
        if (numCorrectGuesses == 3){
            return true;
        }else{
            return false; // default case, also the case for when incorrect guesses is 3
        }
    }

    public void printSonnetString(int stoppedIndexInSonnet){
        for (int i = 0; i < sonnetStringArray.size(); i++){
            if (i < stoppedIndexInSonnet){
                System.out.print(sonnetStringArray.get(i)+" ");
            }else {
                System.out.print("_ ");
            }
        }
        System.out.println();
    }

    public boolean getGuess(String correctString,Scanner sc){
        System.out.print("Prithee(Enter Sonnet Word Guess): ");
        String guess = sc.nextLine().trim();
        String normGuess = guess.replace('’','\'');
        String normCorrect = correctString.replace('’','\'');
        return normGuess.equals(normCorrect);
    }

}
