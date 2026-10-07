import java.util.Scanner;

public class UserInterface {


    Adventure game = new Adventure();

    Scanner scanner = new Scanner(System.in);

    public void start() {

        game.showCurrentRoom();


        while (true) {

            if (game.getPlayer().isDead()) {
                System.out.println("Game Over.");
                break;
            }
            System.out.print("What do you do: ");
            String command = scanner.nextLine();

            if (command.equals("look")) {
                game.look();
            } else if (command.equals("help")) {
                game.help();

            } else if (command.equals("go north")) {
                game.move("go north");
            } else if (command.equals("go east")) {
                game.move("go east");
            } else if (command.equals("go south")) {
                game.move("go south");
            } else if (command.equals("go west")) {
                game.move("go west");
            } else if (command.startsWith("eat ")) {
                String itemName = command.substring(4);
                game.eat(itemName);
            } else if (command.equals("inventory")) {
                game.inventory();
            } else if (command.equals("exit")) {
                System.out.println("Goodbye!");
                break;
            }else if (command.startsWith("pickup ")){
                String itemName = command.substring(7); game.pickup(itemName);}
            else if (command.startsWith("drop ")){
                String itemName = command.substring(5);game.drop(itemName);}
            else if (command.equals("health")){
                game.showHealth();
            }

            else if (command.startsWith("equip "))
            {
                String itemName = command.substring(6);
                game.equip(itemName);
            }
            else if (command.equals("attack")){
                game.attack();

            }
            else
                System.out.println("Unknown command, try again.");
            }
        }
    }