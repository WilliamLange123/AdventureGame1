import java.util.Scanner;

public class UserInterface {


    Adventure game = new Adventure();

    Scanner scanner = new Scanner(System.in);

    public void start() {

        game.look();

//
        while (true) {
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
            } else if (command.equals("inventory")) {
                game.inventory();
            } else if (command.equals("exit")) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Unknown command, try again");
            }
        }

    }
}