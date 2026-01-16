import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class SonnetTest {

    @Test
    void startPritheeGame() {
        Sonnet t = new Sonnet( " welcome'd to-d'd the jungle");
    }

    @Test
    void printSonnetString() {
        int stoppedIndexInSonnet = new Random().nextInt(4);
        Sonnet t = new Sonnet( " welcome'd to-d'd the jungle");
        t.printSonnetString(stoppedIndexInSonnet);
    }

    @Test
    void getGuess() {
        Sonnet t = new Sonnet( " welcome'd to-d'd the jungle");
    }
}