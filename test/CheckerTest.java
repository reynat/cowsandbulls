import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CheckerTest {
    
    @Test
    public void canMakeChecker() {
        Secret secret = new Secret("1234");
        Checker newChecker = new Checker(secret);

        assertNotNull(newChecker);
    }

    @Test
    public void gives4BullsWhenGuessEqualsSecret() {
        Secret secret = new Secret("1234");
        Secret guess = new Secret("1234");
        Checker newChecker = new Checker(secret);
        Feedback feedback = newChecker.giveFeedback(guess);

        int actual = feedback.bulls;
        assertEquals(4, actual);
    }

    @Test
    public void gives1BullWhenThereIs1NumberInTheCorrectPosition() {
        Secret secret = new Secret("1234");
        Secret guess = new Secret("1567");
        Checker newChecker = new Checker(secret);
        Feedback feedback = newChecker.giveFeedback(guess);

        int actual = feedback.bulls;
        assertEquals(1, actual);
    }

    @Test
    public void gives2BullsWhenThereAre2NumbersInTheCorrectPosition() {
        Secret secret = new Secret("1234");
        Secret guess = new Secret("1267");
        Checker newChecker = new Checker(secret);
        Feedback feedback = newChecker.giveFeedback(guess);

        int actual = feedback.bulls;
        assertEquals(2, actual);
    }

    @Test
    public void gives1CowWhenThereIs1NumberInTheWrongPosition() {
        Secret secret = new Secret("1234");
        Secret guess = new Secret("1245");
        Checker newChecker = new Checker(secret);
        Feedback feedback = newChecker.giveFeedback(guess);

        int actual = feedback.cows;
        assertEquals(1, actual);
    }    
    
    @Test
    public void gives2CowsWhenThereAre2NumbersInTheWrongPosition() {
        Secret secret = new Secret("1234");
        Secret guess = new Secret("1542");
        Checker newChecker = new Checker(secret);
        Feedback feedback = newChecker.giveFeedback(guess);

        int actual = feedback.cows;
        assertEquals(2, actual);
    }
    
    @Test
    public void gives3CowsWhenThereAre3NumbersInTheWrongPosition() {
        Secret secret = new Secret("1234");
        Secret guess = new Secret("5423");
        Checker newChecker = new Checker(secret);
        Feedback feedback = newChecker.giveFeedback(guess);

        int actual = feedback.cows;
        assertEquals(3, actual);
    }

}