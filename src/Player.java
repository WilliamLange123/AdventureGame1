import java.util.ArrayList;
public class Player {
    private Room currentRoom;
    private ArrayList<Item> inventory;
    private int health;

    public Player(Room room1) {
        currentRoom = room1;
        inventory = new ArrayList<>();
        health = 100;
    }

    private Map1 map;

    public Player() {
        map = new Map1();
    }

    public void move(String direction) {

        Room nextRoom = switch (direction.toLowerCase()) {
            case "go north" -> currentRoom.getNorth();
            case "go east" -> currentRoom.getEast();
            case "go south" -> currentRoom.getSouth();
            case "go west" -> currentRoom.getWest();
            default -> null;
        };

        if (nextRoom != null) {
            currentRoom = nextRoom;
            System.out.println("You are currently in: " + currentRoom.getName());
            System.out.println(currentRoom.getDescription());

            if (currentRoom.getEnemies().isEmpty()) { //når man går ind i et, får at vide om der er enemies
                System.out.println("There appears to be no enemies here.");
            } else {
                System.out.println("Beware! There is an enemy here.");
            }
        } else {
            System.out.println("You cant go this way!");
        }

    }

    public void takeItem(Item item) {
        if (item != null) {
            inventory.add(item);
        }
    }

    public void dropItem(Item item) {
        inventory.remove(item);
        currentRoom.addItem(item);
    }

    public void showInventory() {

        if (inventory.isEmpty()) {

            System.out.println("Your inventory is empty.");
            return;
        }
        System.out.println("Inventory: ");

        for (Item item : inventory) {

            if (item instanceof Food) { //expanded, viser også food health nu i inventory
                Food food = (Food) item;

                System.out.println(
                        item.getDisplayName()
                        + " (Health: "
                        + food.getHealthPoints()
                        + ")."
                );
            } else if (item instanceof Weapon) { //viser våben damage i inventory
                Weapon weapon = (Weapon) item;
                System.out.println(
                        item.getDisplayName()
                                + " (Damage: " + weapon.getDamage() + ")"
                );

            } else {
                System.out.println(item.getDisplayName());
            }
        }
        System.out.println();
        if (equippedWeapon == null) {
            System.out.println("Equipped weapon: None");
        } else {
            System.out.println("Equipped weapon: "
                    + equippedWeapon.getDisplayName());
        }
    }

    public enum EatResult {NOT_FOUND, NOT_FOOD, EATEN}

    public class EatOutcome {
        private final EatResult result;
        private final String itemName;   // tingens lange navn (null hvis den ikke blev fundet)
        private final int healthChange;  // 0 hvis intet blev spist

        public EatOutcome(EatResult result, String itemName, int healthChange) {
            this.result = result;
            this.itemName = itemName;
            this.healthChange = healthChange;
        }

        public EatResult getResult() {
            return result;
        }

        public String getItemName() {
            return itemName;
        }

        public int getHealthChange() {
            return healthChange;
        }
    }

    public EatOutcome eat(String itemName) {

        // Tjek inventory først
        for (int i = 0; i < inventory.size(); i++) {

            Item item = inventory.get(i);

            if (item.getShortName().equalsIgnoreCase(itemName)) {

                if (!(item instanceof Food)) {
                    return new EatOutcome(
                            EatResult.NOT_FOOD,
                            item.getShortName(),
                            0
                    );
                }

                Food food = (Food) item;

                inventory.remove(i);
                heal(food.getHealthPoints());

                return new EatOutcome(
                        EatResult.EATEN,
                        item.getShortName(),
                        food.getHealthPoints()
                );
            }
        }

        // Hvis ikke i inventory, så tjek rummet
        Item item = currentRoom.removeItem(itemName);

        if (item != null) {

            if (!(item instanceof Food)) {

                currentRoom.addItem(item);

                return new EatOutcome(
                        EatResult.NOT_FOOD,
                        item.getShortName(),
                        0
                );
            }

            Food food = (Food) item;

            heal(food.getHealthPoints());

            return new EatOutcome(
                    EatResult.EATEN,
                    item.getShortName(),
                    food.getHealthPoints()
            );
        }

        // Kun hvis item'et hverken findes i inventory eller rum
        return new EatOutcome(
                EatResult.NOT_FOUND,
                null,
                0
        );

    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom() {
        this.currentRoom = currentRoom;
    }

    public void look() {
        System.out.println("You are currently in: " + currentRoom.getName());
        currentRoom.look();

    }

    public void pickup(String itemName) {
        Item item = currentRoom.removeItem(itemName);

        if (item != null) {
            inventory.add(item);

            if (item instanceof Food) { //expanded, så den viser hvor meget health maden giver
                Food food = (Food) item;

                System.out.println(
                        "You picked up the "
                                + item.getShortName()
                                + " (Health: "
                                + food.getHealthPoints()
                                + ")."
                );
            } else if (item instanceof Weapon) { //viser hvor meget damage et våben slår med
                Weapon weapon = (Weapon) item;
                System.out.println(
                        "You picked up the " + item.getShortName()
                                + " (Damage: " + weapon.getDamage() + ")."
                );
            } else {
                System.out.println(
                        "You picked up the "
                                + item.getShortName()
                                + "."
                );
            }
        }
        else {
            System.out.println("That item is not here.");
        }
    }

    public void drop(String itemName) {
        for (Item item : inventory) {
            if (item.getShortName().equalsIgnoreCase(itemName)) {
                inventory.remove(item);
                currentRoom.addItem(item);
                System.out.println("You dropped the " + item.getDisplayName());
                return;
            }
        }
        System.out.println(" You don't have that item. ");
    }

    public void showHealth() {

        if (health >= 100) {
            System.out.println("Health: " + health + " - You are in perfect health.");
        } else if (health >= 70) {
            System.out.println("Health: " + health + " - You are feeling good.");
        } else if (health >= 40) {
            System.out.println("Health: " + health + " - You are injured.");
        } else if (health >= 1) {
            System.out.println("Health: " + health + " - You are badly hurt.");
        } else {
            System.out.println("Health: " + health + " - You should be dead.");
        }

    }

    public void takeDamage(int amount) {
        health -= amount;

        System.out.println("You lost " + amount + " health. You currently have " + health + " health.");

        if (health <= 0) {
            System.out.println("You are dead!");
        }
    }

    public void heal(int amount) {
        health += amount;

    }
    public boolean isDead() {
        return health <= 0;
    }

    public Item findItem(String itemName) {
        for (Item item : inventory) {
            if (item.getShortName().equalsIgnoreCase(itemName)) {
                return item;
            }
        }
        return null;
    }

    private Weapon equippedWeapon;

    public Weapon getEquippedWeapon() {
        return equippedWeapon;
    }

    public void setEquippedWeapon(Weapon weapon) {
        equippedWeapon = weapon;
    }

    public void equip(String itemName) {
        Item item = findItem(itemName);

        if (item == null) {
            System.out.println("Item not found.");
            return;
        }

        if (item.canEquip()) {
            setEquippedWeapon((Weapon) item);

            System.out.println(item.getDisplayName() + " equipped (Damage: "
                    + getEquippedWeapon().getDamage() + ")."); //se om det virker i morgen.
        } else {
            System.out.println("You cannot equip that item.");
        }
    }

    public void attack(Enemy enemy) {

        if (enemy == null) {
            System.out.println("There is no enemy to attack.");
            return;
        }
        if (equippedWeapon == null) {
            System.out.println("No weapon equipped.");
            return;
        }
        if (!equippedWeapon.canUse()) {
            System.out.println("No ammunition left.");
            return;
        }
        int damage = equippedWeapon.getDamage();

        equippedWeapon.attack();

        enemy.hit(damage);

        System.out.println(
                "You "
                + equippedWeapon.getAttackVerb()
                + " the "
                + enemy.getLongName()
                + " with "
                + equippedWeapon.getDisplayName()
                + " and deal "
                + damage
                + " damage. "
                + equippedWeapon.getUsesLeftText()
        );
        if (enemy.getHealth() > 0) {
            enemy.attack(this);
        }
        else {
            System.out.println(
                    "You killed " + enemy.getLongName() + ". " +
                    enemy.getWeapon().getDisplayName() +
                    " dropped to the ground."
            );
        }
    }
}