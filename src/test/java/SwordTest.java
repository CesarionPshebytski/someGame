import org.junit.Before;

import static org.junit.Assert.*;

public class SwordTest {
    private Character c1,c2;
    private Sword sword;

    @Before
    public void setUp() {
        c1 = new King();
        c2 = new Hobbit();
        sword = new Sword();
    }

    @org.junit.Test
    public void kick() throws Exception {
        sword.kick(c1,c2);
        assertFalse(c2.isAlive());
    }

}