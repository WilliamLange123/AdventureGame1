import java.util.ArrayList;

public class Room {

    private String name;
    private String description;
    private ArrayList<Item> Item;
    private ArrayList<Enemy> enemies;

    private Room north;
    private Room east;
    private Room south;
    private Room west;

    public Room(String name, String description) {
        this.description = description;
        this.name = name;
        this.Item = new ArrayList<>();
        this.enemies = new ArrayList<>();
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public Room getEast() {
        return east;
    }

    public Room getNorth() {
        return north;
    }

    public Room getSouth() {
        return south;
    }

    public Room getWest() {
        return west;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public void addItem(Item item) {
        Item.add(item);
    }

    public Item removeItem(String itemName) {

        for (Item item : Item) {
            if (item.getShortName().equalsIgnoreCase(itemName)) {
                Item.remove(item);
                return item;
            }
        }
        return null;
    }

    public ArrayList<Item> getItems() {
        return Item;
    }

    public void look() {

        System.out.println(getDescription());

        if (Item.isEmpty()) {
            System.out.println("There are no items here.");
        } else {
            System.out.println("You can see:");

            for (Item item : Item) { //expanded, viser nu også health maden giver
                if (item instanceof Food) {
                    Food food = (Food) item;

                    System.out.println("- " + item.getLongName() + " (Health: " + food.getHealthPoints() + ").");
                } else if (item instanceof Weapon) {
                    Weapon weapon = (Weapon) item;
                    System.out.println("- " + item.getLongName() + " (Damage: " + weapon.getDamage() + ").");
                } else {
                    System.out.println("- " + item.getLongName());
                }
            }
        }
        if (enemies.isEmpty()) {
            System.out.println("There are no enemies here.");
        } else {
            System.out.println("Enemies:");

            for (Enemy enemy : enemies) { //nyt, viser nu enemies health og damage ved siden af deres navn.
                System.out.println("- " + enemy.getLongName() + " (Health: " + enemy.getHealth() + ". Damage: " + enemy.getDamage() + ").");

                System.out.println(enemy.getDescription());
            }
        }
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public void addEnemy(Enemy enemy) {
        enemies.add(enemy);
    }

    public void removeEnemy(Enemy enemy) {
        enemies.remove(enemy);
    }

    public Enemy findEnemy(String shortName) { //vi havde glemt at skrive det ind
        for (Enemy enemy : enemies) {
            if (enemy.getShortName().equalsIgnoreCase(shortName)) {
                return enemy;
            }
        }

        return null;
    }
}