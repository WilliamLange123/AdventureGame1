public class MeleeWeapon extends Weapon {

    public MeleeWeapon(String shortName, String longName, int damage) {
        super(shortName, longName, damage);
    }

    @Override
    public boolean canUse() {
        return true;
    }

    @Override
    public void attack() {
    }

    @Override
    public String getAttackVerb() {
        return "slash";
    }

    @Override
    public String getUsesLeftText() {
        return "unlimited uses";
    }
}
