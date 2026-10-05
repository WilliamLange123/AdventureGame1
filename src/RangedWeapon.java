public class RangedWeapon extends Weapon{

    private int ammunition;

    public RangedWeapon(String name, String description, int damage, int ammunition){

        super(name, description, damage);
        this.ammunition = ammunition;
    }
    public int getAmmunition(){
        return ammunition;
    }
    public void useAmmuntion (){
        ammunition--;
    }
}
