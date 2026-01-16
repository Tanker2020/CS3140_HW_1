import java.util.regex.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        String sonnetString = """
                Two households, both alike in dignity,
                In fair Verona, where we lay our scene,
                From ancient grudge break to new mutiny,
                Where civil blood makes civil hands unclean.
                From forth the fatal loins of these two foes
                A pair of star-cross’d lovers take their life;
                Whose misadventured piteous overthrows
                Do with their death bury their parents’ strife.
                The fearful passage of their death-mark’d love,
                And the continuance of their parents’ rage,
                Which, but their children’s end, nought could remove,
                Is now the two hours’ traffic of our stage;
                The which if you with patient ears attend,
                What here shall miss, our toil shall strive to mend.
                """;
        Sonnet sonnetPlayer = new Sonnet(sonnetString);
        boolean outcome = sonnetPlayer.startPritheeGame();
        if (outcome) {
            System.out.println("Congratulations, You Made 3 Good Guesses!");
        }else{
            System.out.println("Horrible Job You Failed with 3 Wrong Guesses.");
        }
    }

    public static ArrayList<String> splitStringToWords(String str) {
        // Using Regex we are able to split the string based on words
        Pattern p = Pattern.compile("\\p{L}+(?:[-'’]\\p{L}+)*");
        Matcher m = p.matcher(str);

        ArrayList<String> words = new ArrayList<>();

        while (m.find()) {
            words.add(m.group());
        }

        return words;
    }
}
