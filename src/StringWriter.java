import java.io.PrintStream;

public class StringWriter implements Writer<String> {
    
    private PrintStream target;

    public StringWriter() {
        this.target = System.out;
    }

    public void print(String output) {
        target.println(output);
    }
}