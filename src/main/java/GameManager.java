//created by yur

public class GameManager extends CharacterFactory {
    public void fight(Character c1, Character c2) {
        charactersStatus(c1, c2);
        if (c1.getClass().equals(c2.getClass()) &&
                (c1.getClass().equals(Hobbit.class) || c2.getClass().equals(Elf.class))) {
            System.out.println("We cannot even kill ourselves :c");
        } else {
            while (c1.isAlive() && c2.isAlive()) {
                c1.kick(c2);
                if (c2.isAlive()) {
                    c2.kick(c1);
                    charactersStatus(c1, c2);
                } else break;
            }
            if (c1.isAlive()) {
                System.out.println(c1.getName() + " wins!");
            } else {
                System.out.println(c2.getName() + " wins!");
            }
        }
    }

    private void charactersStatus(Character c1, Character c2) {
        System.out.println("§ " + c1.getName() + " hp: " + c1.getHp() + ", power: " + c1.getPower());
        System.out.println("§ " + c2.getName() + " hp: " + c2.getHp() + ", power: " + c2.getPower() + "\n");
    }
}


//GameManager: void fight(Character c1, Character c2) - to provide fight between to characters and explaing via command
// line what happens during the fight, till both of the characters are alive.
