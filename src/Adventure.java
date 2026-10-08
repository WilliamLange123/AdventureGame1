import java.util.Locale;

public class   Adventure {
    private Player player;
    private Map1 map;

    public Adventure() {
        map = new Map1();
        player = new Player(map.getStartingRoom());
    }

    public void move(String direction) {
        player.move(direction);
    }

    public void look() {
        player.look();
    }

    public void showHealth() {
        player.showHealth();
    }

    public void help() {
        System.out.println("Available commands:");
        System.out.print("go north, ");
        System.out.print("go east, ");
        System.out.print("go south, ");
        System.out.print("go west, ");
        System.out.print("look, ");
        System.out.print("eat, ");
        System.out.print("pickup, ");
        System.out.print("drop, ");
        System.out.print("inventory, ");
        System.out.print("help, ");
        System.out.print("health, ");
        System.out.print("equip, ");
        System.out.print("unequip, ");
        System.out.print("attack, ");
        System.out.println("exit");

    }

    public void inventory() {
        player.showInventory();
    }

    public void showCurrentRoom() {
        System.out.println(player.getCurrentRoom().getDescription());
    }

    public void pickup(String itemName) {
        player.pickup(itemName);
    }

    public void drop(String itemName) {
        player.drop(itemName);
    }

    public void eat(String itemName) {
        Player.EatOutcome outcome = player.eat(itemName);
        switch (outcome.getResult()) {
            case EATEN:
                if (outcome.getHealthChange() >= 0) {
                    System.out.println("You ate " + outcome.getItemName() + ". You gained " + outcome.getHealthChange() + " health.");
                } else {
                    System.out.println("You ate " + outcome.getItemName() + ". You lost " + Math.abs(outcome.getHealthChange()) + " health.");
                }
                break;

            case NOT_FOOD:
                System.out.println("You can't eat that.");
                break;

            case NOT_FOUND:
                System.out.println("You don't have that item.");
                break;
        }
    }

    public void equip(String itemName) {
        player.equip(itemName);
    }

    public void unequip(String itemName) {
        player.unequip(itemName);
    }

    public void attack(){
        System.out.println("Cannot attack. please specify an enemy");
    }
    public void attack(String enemyName) {

        if (player.getCurrentRoom().getEnemies().isEmpty()) {
            System.out.println("There is no enemy here to attack.");
            return;
        }

        for (Enemy enemy : player.getCurrentRoom().getEnemies()) {
            if (enemy.getShortName().equalsIgnoreCase(enemyName)) {
                player.attack(enemy);
                return;
            }
        }
        System.out.println("No enemy with that name is here.");


        //get(0) = den første enemy på listen af enemies i rummet, skrevet i rækkefølgen top to bottom i Map1

    }

    public Player getPlayer() {
        return player;
    }
}