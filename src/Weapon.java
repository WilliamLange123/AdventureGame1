public abstract class Weapon extends Item {

    private final int damage;

    public Weapon(String shortName, String longName, int damage) {
        super(shortName, longName);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public abstract boolean canUse(); //kan våbnet overhovedet bruges nu?

    public abstract void attack(); //brug våbnet

    public abstract String getAttackVerb(); //beskriv hvordan våbnet angrebet, fx slash eller shoot

    public abstract String getUsesLeftText(); //hvor meget ammunition du har

    public boolean canEquip() {
        return true;
    }
}
