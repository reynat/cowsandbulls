import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.ByteArrayInputStream;

import org.junit.Test;

public class ReaderTest {

    @Test
    public void canMakeReader() {
        Reader newReader = new Reader();

        assertNotNull(newReader);
    }

    @Test
    public void canRetrieveSecret() {
        String userInput = "1234";
        ByteArrayInputStream inputBytes = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(inputBytes);
        Reader newReader = new Reader();

        Secret expectedSecret = new Secret("1234");
        Secret actualSecret = newReader.readUserSecret();

        assertEquals(expectedSecret, actualSecret);
    }

    
}