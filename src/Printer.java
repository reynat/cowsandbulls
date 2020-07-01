import java.io.PrintStream;

public class Printer {
    
    private PrintStream output;

    public Printer() {
        this.output = System.out;
    }

    public void printInstruction(String instruction) {
        output.println(instruction);
    }

    public void printFeedback(Feedback feedback) {
        output.println("RESULT: " + feedback.bulls + " BULL and " + feedback.cows + " COW");
    }
}