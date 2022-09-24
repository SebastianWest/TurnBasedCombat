public class SlowZombie extends Zombie {
    int Slow;

    public SlowZombie(String name, int health, int damage, int ability) {
        super("Slow Zombie", 30 , 2 , -5 );
        /// Slow makes the enemy unable to take turns on even numbered turns
        this.Slow = ability;
    }
}
