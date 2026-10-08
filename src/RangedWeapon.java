public class RangedWeapon extends Weapon {

    private int usesLeft;

    public RangedWeapon(String shortName, String longName, int damage, int usesLeft) {
        super(shortName, longName, damage);
        this.usesLeft = usesLeft;
    }

    @Override
    public boolean canUse() {
        return usesLeft > 0;
    }

    @Override
    public void attack() {
        if (canUse()) {
            usesLeft--;
        }
    }

    @Override
    public String getAttackVerb() {
        return "shoot";
    }

    @Override
    public String getUsesLeftText() {
        return usesLeft + " uses left.";
    }
}
