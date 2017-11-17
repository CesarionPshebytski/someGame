//created by yur

public class GameManager extends CharacterFactory {
    public void fight(Character c1, Character c2) {
        charactersStatus(c1, c2);
        System.out.println(
                (c1.equals(c2) && (c1 instanceof Hobbit || c2 instanceof Elf)?
                        "We cannot even kill ourselves :c":
                battle(c1,c2)));
    }

    private String battle(Character c1, Character c2) {
        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);
            charactersStatus(c1, c2);
            Character temp = c2;
            c2 = c1;
            c1 = temp;
        }
        return c1.isAlive() ? c1.getName() : c2.getName() + " wins!";
    }

    private void charactersStatus(Character c1, Character c2) {
        System.out.println("§ "
                + c1.getName()
                + " hp: "
                + c1.getHp()
                + ", power: "
                + c1.getPower()
                + "\n§ "
                + c2.getName()
                + " hp: "
                + c2.getHp()
                + ", power: "
                + c2.getPower()
                + "\n");
    }
}


//GameManager: void fight(Character c1, Character c2) - to provide fight
// between two characters and explaing via command line what happens during
// the fight, till both of the characters are alive.
