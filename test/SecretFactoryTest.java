import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SecretFactoryTest {
    
    @Test
    public void canCreateBoringSecret() {
        String type = "boring";
        Secret actual = SecretFactory.createSecret(type);

        assertTrue(actual instanceof BoringSecret);
    }

    @Test
    public void canCreateRandomSecret() {
        String type = "random";
        Secret actual = SecretFactory.createSecret(type);

        assertTrue(actual instanceof RandomSecret);
    }
}