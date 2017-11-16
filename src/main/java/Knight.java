class Knight extends Character {
    private KickBehavior kickBehavior = new Sword();

    Knight() {
        super(2, 21, 2, 12);
    }

    @Override
    void kick(Character character) {
        shout(character.getName() + ", say hello to my sword!");
        kickBehavior.kick(this, character);
    }
}


//Knight: power 2-12, hp 2-21, kick(like King)
