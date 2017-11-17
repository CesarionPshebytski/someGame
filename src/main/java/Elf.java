public class Elf extends Character {

    Elf() {
        setPower(10);
        setHp(10);
    }

    @Override
    void kick(Character character) {
        shout("Here we go, " + character.getName() + "!");
        character.setHp(character.getPower() < getPower()?0:character.getPower() - 1);
        character.setPower(character.getPower() < getPower()?0:character.getPower());
        shout(character.getName() + ", better luck next time!\n");
    }
}


//Elf: power = 10, hp= 10, kick(kill everybody which weaker than him,
// otherwise decrease power of the other character by 1)
