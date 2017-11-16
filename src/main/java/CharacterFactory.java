import java.util.Random;

class CharacterFactory {
    Character createCharacter() {
        switch (new Random().nextInt(4)) {
            case 0:
                return new King();
            case 1:
                return new Knight();
            case 2:
                return new Elf();
            default:
                return new Hobbit();
        }
    }
}


//CharacterFactory: Character createCharacter() - returns random instance of any existing character.
