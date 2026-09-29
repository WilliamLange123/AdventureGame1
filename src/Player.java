import java.util.ArrayList;
public class Player {
    private Room currentRoom;
    private ArrayList<Item> inventory;

    public Player(Room room1) {
        currentRoom = room1;
        inventory = new ArrayList<>();
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
        } else {
            System.out.println("You cant go this way!");
        }

    }

    public void takeItem(Item item) {
        // currentRoom.removeItem(Item);
        inventory.add(item);
    }

    public void dropItem(Item item) {
        inventory.remove(item);
        currentRoom.addItem(item);
    }

    public void showInventory() {

        if (inventory.isEmpty()) {

            System.out.println("your inventory is empty. ");
            return;
        }
        System.out.println("inventory: ");


        for (Item item : inventory) {
            System.out.println(item.getShortName());
        }
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
            System.out.println("You picked up the " + item.getShortName());
        } else {
            System.out.println("That item is not here.");
        }
    }
    public void drop(String itemName){
        for ( Item item : inventory) {
            if (item.getShortName().equalsIgnoreCase(itemName)) {
                inventory.remove(item);
                currentRoom.addItem(item);
                System.out.println("You dropped the " + item.getShortName());
                return;
            }

    }
        System.out.println(" You don't have that item. " );

    }
    }


