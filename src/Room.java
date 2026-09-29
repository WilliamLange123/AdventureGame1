import java.util.ArrayList;

public class Room {

    private String name;
    private String description;
    private ArrayList<Item> Item;

    private Room north;
    private Room east;
    private Room south;
    private Room west;

    public Room(String name, String description) {
        this.description = description;
        this.name = name;
        this.Item = new ArrayList<>();
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

            for (Item item : Item) {
                System.out.println("- " + item.getShortName());


                        }
                    }
                }
    public void showItems() {

        if (Item.isEmpty()) {

            System.out.println("There are no items here.");

        } else {

            System.out.println("You can see:");

            for (Item item : Item) {

                System.out.println("- " + item.getShortName());

            }
        }
    }

            }







