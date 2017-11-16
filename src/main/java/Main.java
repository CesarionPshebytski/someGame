public class Main {
    public static void main(String[] args) {
        GameManager manager = new GameManager();
        Character c1 = manager.createCharacter();
        Character c2 = manager.createCharacter();
        manager.fight(c1, c2);
    }
}
