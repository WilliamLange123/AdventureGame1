import java.util.Scanner;

public class Adventure {

        Scanner scanner = new Scanner(System.in);

            public static void main(String[] args) {

                Map1 map = new Map1();

                Scanner scanner = new Scanner(System.in);

                while (true) {

                    System.out.println("Du er i: " + map.getCurrentRoom().getName());
                    System.out.println("Vægle for at komme vidrer " );

                    System.out.println( map.getCurrentRoom().getDescription());

                    System.out.println("N = North ");
                    System.out.println("S = South");
                    System.out.println("E = East" );
                    System.out.println("W = West");

                    String valg = scanner.nextLine();

                    if (valg.equalsIgnoreCase("N")) {

                        if (map.getCurrentRoom().getNorth() != null) {
                            map.setCurrentRoom(
                                    map.getCurrentRoom().getNorth());
                        } else System.out.println("You can't go this derication");

                    } else if (valg.equalsIgnoreCase("S")) {

                        if (map.getCurrentRoom().getSouth() != null) {
                            map.setCurrentRoom(
                                    map.getCurrentRoom().getSouth());
                        } else {
                            System.out.println("Der mangler en værdo");
                        }

                    } else if (valg.equalsIgnoreCase("E")) {

                        if (map.getCurrentRoom().getEast() != null) {
                            map.setCurrentRoom(
                                    map.getCurrentRoom().getEast());
                        }

                    } else if (valg.equalsIgnoreCase("W")) {

                        if (map.getCurrentRoom().getWest() != null) {
                            map.setCurrentRoom(
                                    map.getCurrentRoom().getWest());
                        }

                    }

                    if (map.getCurrentRoom().getName().equals("Rum 9")) {

                        System.out.println("Tillykke! Du har nået Rum 9 og vundet spillet!");
                        break;
                    }
                }
            }
        }



