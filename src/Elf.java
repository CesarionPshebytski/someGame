public class Elf extends Character {

    Elf() {
        super.power = 10;
        super.hp = 10;
    }

    @Override
    void kick(Character character) {
        shout("Here we go, " + character.name +"!");
        if (character.power < this.power) {
            character.hp = 0;
            shout(character.name + ", better luck next time!\n");
        } else {
            shout("The next will be the last for u!\n");
            character.power--;
        }
    }
}


//Elf: power = 10, hp= 10, kick(kill everybody which weaker than him, otherwise decrease power of the other character by 1)
