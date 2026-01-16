import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class SonnetTest {

    @Test
    void printSonnetString() {
        int stoppedIndexInSonnet = new Random().nextInt(4);
        Sonnet t = new Sonnet( " welcome'd to-d'd the jungle");
        t.printSonnetString(stoppedIndexInSonnet);
    }
}