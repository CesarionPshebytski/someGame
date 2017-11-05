public class Hobbit extends Character {

    Hobbit() {
        super.power = 0;
        super.hp = 3;
    }

    @Override
    void kick(Character character) {
        toCry();
    }

    private void toCry() {
        shout("I can't take it anymore. I just wanna die.\n");
    }
}


//Hobbit: power = 0, hp = 3, kick(toCry()l)
