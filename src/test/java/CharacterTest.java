import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterTest {

    private Character character;

    @Before
    public void init() {
        character = new Hobbit();
    }

    @Test
    public void isAliveTest() throws Exception {
        assertTrue(character.isAlive());
    }

    @Test
    public void getPowerTest() throws Exception {
        assertTrue(character.getPower() == 0);
    }

    @Test
    public void getHpTest() throws Exception {
        System.out.println(character.getHp());
        assertFalse(character.getHp() == 5);
    }

    @Test
    public void getNameTest() throws Exception {
        assertTrue(!character.getName().isEmpty());
    }

    @Test
    public void setHpTest() throws Exception {
        character.setHp(20);
        assertTrue(character.getHp() == 20);
    }

    @Test
    public void setPowerTest() throws Exception {
        character.setPower(20);
        assertTrue(character.getPower() == 20);
    }


}