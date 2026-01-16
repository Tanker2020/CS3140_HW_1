import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;

class MainTest {

    @org.junit.jupiter.api.Test
    void splitStringToWords() {
        ArrayList<String> expected = new ArrayList<> (Arrays.asList("welcome'd", "to-d'd", "the", "jungle"));
        ArrayList<String> actual = Main.splitStringToWords(" welcome'd to-d'd the jungle");

        assertEquals(expected, actual, "splitStringToWords failed word was not split");
    }
}