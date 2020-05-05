public class CodeFactory {
    public static Code getInstance(Object newCode) {
        if (newCode instanceof Integer) {
            return new Digits((Integer) newCode);
        }
        return null;
    }
}