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
        Checker.Feedback feedback = newChecker.giveFeedback(guess);

        int actual = feedback.bulls;
        assertEquals(actual, 4);
    }

    @Test
    public void gives1BullWhenThereIs1NumberInTheCorrectPosition() {
        Secret secret = new Secret("1234");
        Secret guess = new Secret("1567");
        Checker newChecker = new Checker(secret);
        Checker.Feedback feedback = newChecker.giveFeedback(guess);

        int actual = feedback.bulls;
        assertEquals(actual, 1);
    }

    @Test
    public void gives2BullsWhenThereAre2NumbersInTheCorrectPosition() {
        Secret secret = new Secret("1234");
        Secret guess = new Secret("1267");
        Checker newChecker = new Checker(secret);
        Checker.Feedback feedback = newChecker.giveFeedback(guess);

        int actual = feedback.bulls;
        assertEquals(actual, 2);
    }

    @Test
    public void gives1CowWhenThereIs1NumberInTheWrongPosition() {
        Secret secret = new Secret("1234");
        Secret guess = new Secret("1245");
        Checker newChecker = new Checker(secret);
        Checker.Feedback feedback = newChecker.giveFeedback(guess);

        int actual = feedback.cows;
        assertEquals(actual, 1);
    }    
    
    @Test
    public void gives2CowsWhenThereAre2NumbersInTheWrongPosition() {
        Secret secret = new Secret("1234");
        Secret guess = new Secret("1542");
        Checker newChecker = new Checker(secret);
        Checker.Feedback feedback = newChecker.giveFeedback(guess);

        int actual = feedback.cows;
        assertEquals(actual, 2);
    }
    
    @Test
    public void gives3CowsWhenThereAre3NumbersInTheWrongPosition() {
        Secret secret = new Secret("1234");
        Secret guess = new Secret("5423");
        Checker newChecker = new Checker(secret);
        Checker.Feedback feedback = newChecker.giveFeedback(guess);

        int actual = feedback.cows;
        assertEquals(actual, 3);
    }

}