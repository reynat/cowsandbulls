public class Checker {
    
    private Secret secret;

    class Feedback {
        public int cows;
        public int bulls;

        public Feedback(int cows, int bulls) {
            this.cows = cows;
            this.bulls = bulls;
        }
    }

    public Checker (Secret secret) {
        this.secret = secret;
    }

    public Feedback giveFeedback(Secret guess) {
        if (secret.equals(guess)) {
            return new Checker.Feedback(0, 4);
        } else {
            char[] guessChar = guess.getDigits().toCharArray();
            char[] secretChar = secret.getDigits().toCharArray();
            int numBulls = 0; 
            int numCows = 0;
            
            for (int i = 0; i < guessChar.length; i++ ) {
                if (guessChar[i] == secretChar[i]) {
                    numBulls++;
                } else if (secret.getDigits().contains(String.valueOf(guessChar[i]))) {
                    numCows++;
                }
            }

            return new Checker.Feedback(numCows, numBulls);
        }
    }
}