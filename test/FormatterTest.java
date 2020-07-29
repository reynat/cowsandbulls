import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class FormatterTest {

    @Test
    public void canReturnFeedback() {
        Feedback feedback = new Feedback(1, 3);
        String expected = "RESULT: 3 BULL and 1 COW"; 
        String actual = Formatter.getFeedback(feedback);

        assertEquals(expected, actual);
    }
    
}