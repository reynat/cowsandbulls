import static org.junit.Assert.assertNotNull;

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
        Secret guess = newPlayer.makeASecret();

        assertNotNull(guess);
    }

}