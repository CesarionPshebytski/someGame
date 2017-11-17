//created by yur

public class GameManager extends CharacterFactory {
    public void fight(Character c1, Character c2) {
        charactersStatus(c1, c2);
        if ((c1.getClass().equals(Hobbit.class) || c1.getClass().equals(Elf.class)) && c1.getClass().equals(c2.getClass())) {
            System.out.println("We cannot even kill ourselves :c");
        } else {
            while (c1.isAlive() && c2.isAlive()) {
                c1.kick(c2);
                charactersStatus(c1, c2);
                Character temp = c2;
                c2 = c1;
                c1 = temp;
            }
            System.out.println(c1.isAlive() ? c1.getName() : c2.getName() + " wins!");
        }
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
