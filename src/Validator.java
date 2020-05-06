import java.util.HashSet;
import java.util.Set;

public class Validator {

    private final int length;
    private final boolean duplicates;

    public Validator(int length, boolean hasDuplicates) {
        this.length = length;
        this.duplicates = hasDuplicates;
    }

    public boolean isValidCode(String input) {
        boolean correctLength = isCorrectLength(input, this.length);
        boolean correctType = isAllDigits(input);

        if (!this.duplicates) {
            return correctLength && correctType && !hasDuplicates(input);
        } else
            return correctLength && correctType;
    }

    private boolean isCorrectLength(String input, int length) {
        String[] inputArray = input.split("");
        return inputArray.length == length;
    }

    private boolean isAllDigits(String input) {
        return input.matches("^[0-9]+");
    }

    private boolean hasDuplicates(String input) {
        String[] letters = input.split("");
        Set<String> store = new HashSet<>();

        for (String letter : letters) {
            if (store.add(letter) == false) {
                return true;
            }
        }

        return false;
    }
}