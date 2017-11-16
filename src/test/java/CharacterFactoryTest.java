
import org.junit.Before;

import static org.junit.Assert.*;

public class CharacterFactoryTest {
    private CharacterFactory factory;

    @Before
    public void setUp() {
        factory = new CharacterFactory();
    }

    @org.junit.Test
    public void createCharacter() throws Exception {
        Character c1 = new Hobbit();
        Character c2 = factory.createCharacter();
        c1.kick(c2);
        assertTrue(c2.isAlive());
    }

}