import java.util.regex.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        String sonnetString = "Two households, both alike in dignity,\n" +
                "In fair Verona, where we lay our scene,\n" +
                "From ancient grudge break to new mutiny,\n" +
                "Where civil blood makes civil hands unclean.\n" +
                "From forth the fatal loins of these two foes\n" +
                "A pair of star-cross’d lovers take their life;\n" +
                "Whose misadventured piteous overthrows\n" +
                "Do with their death bury their parents’ strife.\n" +
                "The fearful passage of their death-mark’d love,\n" +
                "And the continuance of their parents’ rage,\n" +
                "Which, but their children’s end, nought could remove,\n" +
                "Is now the two hours’ traffic of our stage;\n" +
                "The which if you with patient ears attend,\n" +
                "What here shall miss, our toil shall strive to mend.\n";
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
