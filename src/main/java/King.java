class King extends Character {
    private KickBehavior kickBehavior = new Sword();

    King() {
        super(5, 15, 5, 15);
    }

    @Override
    void kick(Character character) {
        kickBehavior.kick(this, character);
    }
}


//King: power 5-15, hp 5-15, kick(decrease number of hp of the enemy by random number which will be in range of his power)
