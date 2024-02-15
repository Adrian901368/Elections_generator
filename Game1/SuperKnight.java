public class SuperKnight extends Knight {
    int energy;

    void attack(Ogre ogre) {
        ogre.energy = (int) (0.5 * ogre.energy); // (int) just casts a float result into an int
        this.energy += 10;
        ogre.revenge(this); // this represents a reference to the current knight object
        System.out.println(this);
    }
}
