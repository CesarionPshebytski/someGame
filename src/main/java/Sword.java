import java.util.Random;

public class Sword implements KickBehavior {
    public void kick(Character c1, Character c2) {
        c1.shout(c2.getName() + ", u think " + c2.getHp() +
                "hp would be enough to survive?");
        int x = c1.getPower() + new Random().nextInt(c1.getPower() + 1);
        System.out.println("hp " + -x);
        c2.setHp(c2.getHp() - x);
        c1.shout("That's what i'm talking about, " + c2.getName() +
                ", your hp is now " + c2.getHp() + "!\n");
    }
}