import org.junit.Before;

import static org.junit.Assert.*;

public class KnightTest {
    private Character c1, c2;

    @Before
    public void init() {
        c1 = new Knight();
        c2 = new Hobbit();
    }

    @org.junit.Test
    public void kick() throws Exception {
        c1.kick(c2);
        assertFalse(c2.isAlive());
    }

}