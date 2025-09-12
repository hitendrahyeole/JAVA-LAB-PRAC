import java.util.Scanner;

public class HotelBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] rooms = new int[3][4]; // 3 floors, 4 rooms each

        System.out.println("Welcome to the Hotel Booking System!");

        while (true) {
            System.out.println("\n1. View Rooms");
            System.out.println("2. Book a Room");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            if (choice == 1) {
                viewRooms(rooms);
            } else if (choice == 2) {
                bookRoom(scanner, rooms);
            } else if (choice == 3) {
                System.out.println("Thank you for using the hotel booking system.");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    static void viewRooms(int[][] rooms) {
        System.out.println("Room Status:");
        for (int f = 0; f < rooms.length; f++) {
            System.out.print("Floor " + (f + 1) + ": ");
            for (int r = 0; r < rooms[f].length; r++) {
                if (rooms[f][r] == 0) {
                    System.out.print("[Available] ");
                } else {
                    System.out.print("[Booked] ");
                }
            }
            System.out.println();
        }
    }

    static void bookRoom(Scanner scanner, int[][] rooms) {
        System.out.print("Enter floor number (1-" + rooms.length + "): ");
        int floor = Integer.parseInt(scanner.nextLine()) - 1; // convert to index
        System.out.print("Enter room number (1-" + rooms[0].length + "): ");
        int room = Integer.parseInt(scanner.nextLine()) - 1; // convert to index

        if (floor >= 0 && floor < rooms.length && room >= 0 && room < rooms[0].length) {
            if (rooms[floor][room] == 0) {
                rooms[floor][room] = 1;
                System.out.println("Room " + (room + 1) + " on Floor " + (floor + 1) + " booked successfully!");
            } else {
                System.out.println("Room already booked. Please choose another room.");
            }
        } else {
            System.out.println("Invalid floor or room number. Please try again.");
        }
    }
}
