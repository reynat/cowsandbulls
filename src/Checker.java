public class Checker {
    
    private Secret secret;

    public Checker (Secret secret) {
        this.secret = secret;
    }

    public Feedback giveFeedback(Secret guess) {
        int numBulls = 0; 
        int numCows = 0;

        if (guess.equals(secret)) {
            numBulls = 4;
        } else {
            char[] guessChar = guess.getDigits().toCharArray();
            char[] secretChar = secret.getDigits().toCharArray();
            
            for (int i = 0; i < guessChar.length; i++ ) {
                if (guessChar[i] == secretChar[i]) {
                    numBulls++;
                } else if (secret.getDigits().contains(String.valueOf(guessChar[i]))) {
                    numCows++;
                }
            }
        }

        return new Feedback(numCows, numBulls);

    }
}