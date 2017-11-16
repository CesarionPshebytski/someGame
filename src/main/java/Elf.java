public class Elf extends Character {

    Elf() {
        setPower(10);
        setHp(10);
    }

    @Override
    void kick(Character character) {
        shout("Here we go, " + character.getName() + "!");
        if (character.getPower() < getPower()) {
            character.setHp(0);
            character.setPower(0);
            shout(character.getName() + ", better luck next time!\n");
        } else {
            shout("The next will be the last for u!\n");
            character.setHp(character.getPower() - 1);
        }
    }
}


//Elf: power = 10, hp= 10, kick(kill everybody which weaker than him, otherwise decrease power of the other character by 1)
