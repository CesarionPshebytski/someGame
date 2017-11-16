import java.util.Random;

public abstract class Character {
    private int hp;
    private int power;
    private String name = getClass().getSimpleName();

    public Character() {
    }

    protected Character(int min_hp, int max_hp, int min_pwr, int max_pwr) {
        hp = new Random().nextInt(max_hp - min_hp + 2) + min_hp;
        power = new Random().nextInt(max_pwr - min_pwr + 2) + min_pwr;
    }

    boolean isAlive() {
        return hp > 0;
    }

    void shout(String shout) {
        System.out.println(name + ": " + shout);
    }

    abstract void kick(Character character);

    public int getHp() {
        return hp;
    }

    public int getPower() {
        return power;
    }

    public String getName() {
        return name;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }

    public void setPower(int power) {
        if (power < 0) {
            this.power = 0;
        } else {
            this.power = power;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Character)) return false;

        Character character = (Character) o;

        return power == character.power && hp == character.hp;
    }
}


//Character: int power, int hp, void kick(Character c), boolean isAlive()
