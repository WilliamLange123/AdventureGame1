import java.util.Locale;

public class Adventure {
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
