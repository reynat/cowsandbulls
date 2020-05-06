import java.util.HashSet;
import java.util.Set;

public class Validator {

    public static boolean hasCorrectLength(String input, int length) {
        String[] inputArray = input.split("");
        return inputArray.length == length;
    }

    public static boolean isAllDigits(String input) {
        return input.matches("^[0-9]+");
    }

    public static boolean hasDuplicates(String input) {
        String[] letters = String.valueOf(input).split("");
        Set<String> store = new HashSet<>();

        for (String letter : letters) {
            if (store.add(letter) == false) {
                return true;
            }
        }

        return false;
    }
}