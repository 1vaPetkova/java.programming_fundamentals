package T07associativeArrays.archive;

public class P11Dragon {
    private String name;
    private int damage;
    private int health;
    private int armor;

    public P11Dragon(String name, int damage, int health, int armor) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public int getArmor() {
        return armor;
    }
}
