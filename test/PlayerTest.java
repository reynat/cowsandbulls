import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class PlayerTest {

    @Test
    public void canMakePlayer() {
        Player newPlayer = new Player();

        assertNotNull(newPlayer);
    }

    @Test
    public void canMakeSecret() {
        Player newPlayer = new Player();
        String userInput = "1234";
        ByteArrayInputStream inputBytes = new ByteArrayInputStream(userInput.getBytes());

        String expectedGameOutput = "Please enter a 4 digit guess: You guessed 1234\n";
        ByteArrayOutputStream outputBytes = new ByteArrayOutputStream();
        PrintStream actualGameOutput = new PrintStream(outputBytes);

        Secret expectedSecret = new Secret("1234");
        Secret actualSecret = newPlayer.makeASecret(inputBytes, actualGameOutput);

        assertEquals(expectedSecret, actualSecret);
        assertEquals(expectedGameOutput, outputBytes.toString());
    }

}