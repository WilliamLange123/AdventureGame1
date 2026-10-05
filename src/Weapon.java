public class Weapon extends Item{

    private int damage;

    public Weapon(String name, String description, int damage){
        super(name, description);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public boolean canEquip() {
        return true;
    }
}
