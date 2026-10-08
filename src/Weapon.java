public abstract class Weapon extends Item {

    private final int damage;

    public Weapon(String shortName, String longName, int damage) {
        super(shortName, longName);
        this.damage = damage;
    }
    public int getDamage() {
        return damage;
    }

    public abstract boolean canUse();

    public abstract void attack();

    public abstract String getAttackVerb();

    public abstract String getUsesLeftText();

    public boolean canEquip() {
        return true;
    }

    @Override
    public String getItemInfo() {
        return "Damage: " + damage;
    }
}
