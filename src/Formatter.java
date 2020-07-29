public class Formatter {
    
    public static String getFeedback(Feedback feedback) {
       return  "RESULT: " + feedback.bulls + " BULL and " + feedback.cows + " COW";
    }

    public static String getGameOver(){
        return "Congratulations! You guessed the secret!";
    }

    public static String prompt(){
        return "Please enter a 4 digit guess: ";
    }

}