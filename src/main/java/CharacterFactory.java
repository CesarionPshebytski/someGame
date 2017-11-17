import java.util.Random;

class CharacterFactory {
    Character createCharacter() {
        int x = new Random().nextInt(4);
        return x == 0 ? new King() : x == 1 ? new Knight() : x == 2 ? new Elf() : new Hobbit();
    }
}


//CharacterFactory: Character createCharacter() - returns random
//instance of any existing character.
