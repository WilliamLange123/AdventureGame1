import java.util.Locale;

public class Adventure {

    private Room currentRoom;

    public Adventure(){

        Room room1 = new Room("Room 1", "A scorching chamber lit by rivers of lava. The walls glow red with unbearable heat.");
        Room room2 = new Room("Room 2", "Flames dance across the floor while black smoke crawls along the ceiling. The air reeks of sulfur.");
        Room room3 = new Room("Room 3", "Sharp obsidian spikes rise from the ground. A distant roar echoes through the fiery darkness.");
        Room room4 = new Room("Room 4", "A vast cavern filled with burning embers. Crimson light flickers across the jagged walls.");
        Room room5 = new Room("Room 5", "A narrow room surrounded by pools of molten rock. The heat is so intense that breathing is difficult.");
        Room room6 = new Room("Room 6", "Chains hang from the ceiling, glowing orange from the heat. The sound of crackling fire never stops.");
        Room room7 = new Room("Room 7", "A field of black ash stretches across the floor. Red flames burst from cracks in the ground.");
        Room room8 = new Room("Room 8", "A throne of dark stone stands in the center of the room. The air feels heavy with evil presence.");
        Room room9 = new Room("Room 9", "The deepest chamber of Hell. Lava cascades from the walls, and the room radiates terrifying power.");

        room1.setEast(room2);
        room1.setSouth(room4);

        room2.setEast(room3);
        room2.setWest(room1);

        room3.setSouth(room6);
        room3.setWest(room2);

        room4.setSouth(room7);
        room4.setNorth(room1);

        room5.setSouth(room8);

        room6.setSouth(room9);
        room6.setNorth(room3);

        room7.setNorth(room4);
        room7.setEast(room8);

        room8.setNorth(room5);
        room8.setEast(room9);
        room8.setWest(room7);

        room9.setNorth(room6);
        room9.setWest(room8);

        currentRoom = room1;
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
        }
        else {
            System.out.println("You cant go this way!");
        }
    }
    public void look() {
        System.out.println("You are currently in: " + currentRoom.getName());
        System.out.println(currentRoom.getDescription());
    }
    public void help() {
        System.out.println("Available commands:");
        System.out.println("go north");
        System.out.println("go east");
        System.out.println("go south");
        System.out.println("go west");
        System.out.println("look");
        System.out.println("help");
        System.out.println("exit");
    }

}
