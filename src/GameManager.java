//created by yur

public class GameManager extends CharacterFactory {
    private void fight(Character c1, Character c2) {
        charactersStatus(c1, c2);
        if (c1.name.equals(c2.name) && c1.name.equals("Hobbit")) {
            System.out.println("We cannot even kill ourselves :c");
        } else {
            while (c1.isAlive() & c2.isAlive()) {
                c1.kick(c2);
                if (c2.isAlive()) {
                    c2.kick(c1);
                    charactersStatus(c1, c2);
                } else break;
            }
            if (c1.isAlive()) {
                System.out.println(c1.name + " wins!");
            } else {
                System.out.println(c2.name + " wins!");
            }
        }
    }

    public static void main(String[] args) {
        GameManager manager = new GameManager();
        Character c1 = manager.createCharacter();
        Character c2 = manager.createCharacter();
        manager.fight(c1, c2);
    }

    private void charactersStatus(Character c1, Character c2) {
        System.out.println("§ " + c1.name + " hp: " + c1.hp + ", power: " + c1.power);
        System.out.println("§ " + c2.name + " hp: " + c2.hp + ", power: " + c2.power + "\n");
    }
}


//GameManager: void fight(Character c1, Character c2) - to provide fight between to characters and explaing via command
// line what happens during the fight, till both of the characters are alive.
