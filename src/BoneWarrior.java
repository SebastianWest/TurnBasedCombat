public class BoneWarrior extends Skeleton{
    int Slash = 10;
    public BoneWarrior(String name, int health, int damage, int ability) {
        super("Bone Warrior", 25, 5, 10);
       this.Slash = ability;

    }

    public int getSlash() {
        return Slash;
    }
}
