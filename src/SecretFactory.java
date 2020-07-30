public class SecretFactory {
    
    public static Secret createSecret(String type) {
        if (type.equals("random")) {
            return new RandomSecret();
        }
        return new BoringSecret();
    }
};