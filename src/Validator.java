import java.util.HashSet;
import java.util.Set;

public class Validator {

    public static boolean hasCorrectNumberOfDigits(int input, int length) {
        String[] stringArray = String.valueOf(input).split("");
        return stringArray.length == length;
    }

    public static boolean hasDuplicateDigits(int input) {
        String digits = String.valueOf(input);
        return hasDuplicateLetters(digits);
    }

    public static boolean hasDuplicateLetters(String input) {
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