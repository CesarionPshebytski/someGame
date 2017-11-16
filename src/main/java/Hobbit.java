public class Hobbit extends Character {

    Hobbit() {
        setPower(0);
        setHp(3);
    }

    void kick(Character character) {
        toCry();
    }

    private void toCry() {
        shout("I can't take it anymore. I just wanna die.\n");
    }
}


//Hobbit: power = 0, hp = 3, kick(toCry()l)
