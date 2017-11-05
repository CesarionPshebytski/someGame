import java.util.Random;

class Knight extends Character {

    Knight() {
        Random random = new Random(System.currentTimeMillis());
        super.power = random.nextInt(11) + 2;
        super.hp = random.nextInt(20) + 2;
    }

    @Override
    void kick(Character character) {
        shout(character.name + ", say hello to my sword!");
        int x = new Random().nextInt(this.power + 1);
        System.out.println("hp " + -x);
        character.hp -= x;
        shout(character.hp + "hp is not the reason why you are so upset, " + character.name + ", uh?\n");
    }
}


//Knight: power 2-12, hp 2-21, kick(like King)
