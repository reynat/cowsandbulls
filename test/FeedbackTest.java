import static org.junit.Assert.assertNotNull;

import org.junit.Test;
public class FeedbackTest {
    
    @Test
    public void canMakeFeedback() {
        Feedback newFeedback = new Feedback(1, 3);

        assertNotNull(newFeedback);
    }
}