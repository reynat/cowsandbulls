import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;

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
        System.setIn(inputBytes);

        Secret expected = new Secret("1234");
        Secret actual = newPlayer.makeASecret();

        assertEquals(expected, actual);
    }

}