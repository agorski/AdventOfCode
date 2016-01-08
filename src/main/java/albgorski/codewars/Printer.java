package albgorski.codewars;

import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.asList;

public class Printer {
    private static final Set<Character> COLORS_ALLOWED = new HashSet<>(asList(
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'i', 'j', 'k', 'l', 'm'
    ));

    public static String printerError(String s) {
        int allColoursSize = s.length();
        long amountOfCorrectColors = s
                .chars()
                .filter(i -> COLORS_ALLOWED.contains((char) i))
                .count();
        return (allColoursSize - amountOfCorrectColors) + "/" + allColoursSize;
    }
}