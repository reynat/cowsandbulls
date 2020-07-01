import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class PrinterTest {
    
    @Test
    public void canMakePrinter() {
        Printer newPrinter = new Printer();

        assertNotNull(newPrinter);
    }

    @Test
    public void canPrintFeedback() {
        Feedback feedback = new Feedback(1, 2);
        String expectedGameOutput = "RESULT: 2 BULL and 1 COW\n";
        ByteArrayOutputStream actualGameOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(actualGameOutput));
        Printer newPrinter = new Printer();

        newPrinter.printFeedback(feedback);

        assertEquals(expectedGameOutput, actualGameOutput.toString());
    }
}