// 22.	Define a class Room that represents a hotel room.
// The class should contain the attributes: number, beds, occupied, and guestName.
// Add constructors: Room(number) (creates a room with two beds) and Room(number,beds).
// Next, define methods for room manipulation: checkin(guestName), checkout(), isOccupied(), and displayStatus().
// Then write a program in which create three rooms with two beds, two rooms with three beds and one room with one bed.
// Store all room objects in an array:
//Room[] rooms = new Room[6];

//Then follow the steps below:
//a.	Display status of a single room (room number, number of beds, occupied, guest name). Display data in a single row.
//b.	Display a report with a list of rooms (room number, number of beds, occupied, guest name)
//c.	Display a report with a list of rooms, limited to rooms with the specified number of beds
//d.	Display a report on how many rooms are vacant and how many are occupied
//e.	Display a report on how many vacant beds are available

//Create a separate static method for each report. Pass a list of rooms (an array) to the defined static methods.

//23.	Modify the Room class. Define toString() method that returns information about the room status.
// Replace the displayStatus() method with the defined toString() method.
// Tip: find out in the manual how to define and use the toString() method.



package pl.pankalla.weronika;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Room[] rooms = new Room[6];
        for (int i = 0; i < 3; i++) {
            rooms[i] = new Room(i + 1, 2);
        }

        for (int i = 3; i < 5; i++) {
            rooms[i] = new Room(i + 1, 3);
        }

        rooms[5] = new Room(6, 1);

        rooms[1].checkin("Weronika");
        rooms[4].checkin("Angelika");
        rooms[5].checkin("Gabriela");
        rooms[4].checkout();
        // display status of single room
        System.out.println(rooms[1]);

    }
}