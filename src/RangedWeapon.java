public class RangedWeapon extends Weapon {

    private int usesLeft;

    public RangedWeapon(String shortName, String longName, int damage, int usesLeft) {
        super(shortName, longName, damage);
        this.usesLeft = usesLeft;
    }
    // hvis uses left større end 0 = true, hvis uses left mindre end 0 = false
    @Override
    public boolean canUse() {
        return usesLeft > 0;
    }
    // hver gang man bruger (hvis man kan overhovedet bruge våbnet, så det ikke går i minus), mister man 1 use
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
