import java.util.Random;

public abstract class Character {
    private int hp;
    private int power;
    private String name = getClass().getSimpleName();

    public Character() {
    }

    protected Character(int minHp, int maxHp, int minPower, int maxPower) {
        hp = new Random().nextInt(maxHp - minHp + 2) + minHp;
        power = new Random().nextInt(maxPower - minPower + 2) + minPower;
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

}


//Character: int power, int hp, void kick(Character c), boolean isAlive()
