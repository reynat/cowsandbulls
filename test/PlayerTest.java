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

        String expectedGameOutput = "Please enter a 4 digit guess: ";
        ByteArrayOutputStream outputBytes = new ByteArrayOutputStream();
        PrintStream actualGameOutput = new PrintStream(outputBytes);

        Secret expected = new Secret("1234");
        Secret actual = newPlayer.makeASecret(inputBytes, actualGameOutput);

        assertEquals(expected, actual);
        assertEquals(expectedGameOutput, outputBytes.toString());
    }

}