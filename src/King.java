import java.util.Random;

class King extends Character {

    King() {
        Random random = new Random(System.currentTimeMillis());
        super.power = random.nextInt(11) + 5;
        super.hp = random.nextInt(11) + 5;
    }

    @Override
    void kick(Character character) {
        shout(character.name + ", u think " + character.hp + "hp would be enough to survive?");
        int x = new Random().nextInt(this.power + 1);
        System.out.println("hp " + -x);
        character.hp -= x;
        shout("That's what i'm talking about, " + character.name + ", your hp is now " + character.hp + "!\n");
    }
}


//King: power 5-15, hp 5-15, kick(decrease number of hp of the enemy by random number which will be in range of his power)
