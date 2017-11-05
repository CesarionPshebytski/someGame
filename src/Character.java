import java.util.Random;

public class Character {
    protected int hp = 10;
    protected int power = 10;
    protected String name = getClass().getSimpleName();


    boolean isAlive() {
        return hp > 0;
    }

    void kick(Character character) {
        System.out.println("punch");
    }

    void shout(String shout) {
        System.out.println(name + ": " + shout);
    }
}


//Character: int power, int hp, void kick(Character c), boolean isAlive()
