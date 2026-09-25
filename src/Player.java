public class Player {
    private Room currentRoom;

    public Player(Room room1) {
        currentRoom = room1;
    }

    private Map1 map;

    public Player(){
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
    public Room getCurrentRoom(){
        return currentRoom;
    }
    public void setCurrentRoom(){
        this.currentRoom =currentRoom;
    }
    public void look() {
        System.out.println("You are currently in: " + currentRoom.getName());
        System.out.println(currentRoom.getDescription());
    }

}
