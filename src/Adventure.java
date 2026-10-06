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
    public void showHealth(){
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
        System.out.print("attack, ");
        System.out.println("exit");

    }
    public void inventory() {
        player.showInventory();
    }
    public void showCurrentRoom() {
        System.out.println(player.getCurrentRoom().getDescription());
    }
    public void pickup(String itemName){
        player.pickup(itemName);
    }
    public void drop(String itemName){
        player.drop(itemName);
    }
    public void eat(String itemName) {
        Player.EatOutcome outcome = player.eat(itemName);
        switch (outcome.getResult()) {
            case EATEN:
                System.out.println("You ate " + outcome.getItemName());
                System.out.println("You gained " + outcome.getHealthChange() + " health.");
                break;

            case NOT_FOOD:
                System.out.println("You can't eat that.");
                break;

            case NOT_FOUND:
                System.out.println("You don't have that item.");
                break;

        }
    }
    public void equip(String itemName) {player.equip(itemName);}

    //Player angriber enemy, er kun sat til hvis der kun er 1 enemy i et room, kan ændres senere
    public void attack() {

        if (player.getCurrentRoom().getEnemies().isEmpty()) {
            System.out.println("There is no enemy here to attack.");
            return;
        }

        //get(0) = den første enemy på listen af enemies i rummet, skrevet i rækkefølgen top to bottom i Map1
        Enemy enemy = player.getCurrentRoom().getEnemies().get(0);

        player.attack(enemy);
    }
}