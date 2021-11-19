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

public class Room {

    int roomNumber;
    int beds;
    boolean occupied = false;
    String guestName;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.beds = 2;
    }

    public Room(int roomNumber, int beds)  {
        this.roomNumber = roomNumber;
        this.beds = beds;
    }

    public void checkin(String guestName) {
        this.guestName = guestName;
        this.occupied = true;
    }

    public void checkout() {
        this.guestName = null;
        this.occupied = false;
    }

    public String toString() {
        return "Room " +
                "room number: " + roomNumber +
                ", beds: " + beds +
                ", occupied: " + occupied +
                ", guest name: " + (guestName == null ? "no guest" : guestName);
    }
}