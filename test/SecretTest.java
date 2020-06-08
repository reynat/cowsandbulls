import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

public class SecretTest {

    @Test
    public void canMakeSecret() {
        // Test that you can actually construct a Secret
        Secret actual = new Secret("1234");

        assertNotNull(actual);
    }

    @Test
    public void canMakeTwoIdenticalSecrets() {
        Secret secretA = new Secret("1234");
        Secret secretB = new Secret("1234");

        // Compares using object reference
        assertEquals(secretA, secretB);
    }

    @Test
    public void canMakeTwoDifferentSecrets() {
        Secret secretA = new Secret("1234");
        Secret secretB = new Secret("5678");

        // Compares using object reference
        assertNotEquals(secretA, secretB);
    }

    @Test
    public void cannotMakeSecretLongerThanFourDigits() {
        Secret expected = new Secret("1234");
        Secret actual = new Secret("12345");
        assertEquals(expected, actual);
    }

    @Test
    public void cannotMakeSecretShorterThanFourDigits() {
        Secret expected = new Secret("1230");
        Secret actual = new Secret("123");
        assertEquals(expected, actual);
    }
    
    @Test
    public void cannotMakeSecretWithLetters() {
        Secret expected = new Secret("1230");
        Secret actual = new Secret("123a");
        assertEquals(expected, actual);
    }

    @Test
    public void cannotMakeSecretWithDuplicates() {
        Secret expected = new Secret("1230");
        Secret actual = new Secret("1233");
        assertEquals(expected, actual);
    }
}