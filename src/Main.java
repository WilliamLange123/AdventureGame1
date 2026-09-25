import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Adventure game = new Adventure();

        game.look();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String command = scanner.nextLine();

            if (command.equals("look")){
                game.look();
            }
            else if (command.equals("help")){
                game.help();
            }
            else if (command.equals("go north")) {
                game.move("go north");
            }
            else if (command.equals("go east")) {
                game.move("go east");
            }
            else if (command.equals("go south")) {
                game.move("go south");
            }
            else if (command.equals("go west")) {
                game.move("go west");
            }
            else if (command.equals("exit")) {
                System.out.println("Goodbye!");
                break;
            }
        }

    }
}
