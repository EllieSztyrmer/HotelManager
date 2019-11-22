//imports here
import java.util.ArrayList;

/**
 * This class creates the 3 hotels.
 * Each hotel has anumber of stars and rooms
 * @author Szymon Sztyrmer
 */
public class Hotel
{
    //Some datafields
    private String numberOfStars;
    private int numberOfRooms;
    private ArrayList<Room> roomList = new ArrayList<Room>();

    /**
     * The constructor method
     * @param numberOfStars
     * @param numberOfRooms
     * @author Szymon Sztyrmer
     */
    public Hotel(String numberOfStars)
    {
        this.numberOfStars = numberOfStars;
        this.numberOfRooms = 0;
    }

    /**
     * @author Szymon Sztyrmer
     * @return numberOfStars. The number of starts the hotel has
     */
    public String getNumberOfStars()
    {
        return numberOfStars;
    }

    /**
     * @author Szymon Sztyrmer
     * @return numberOfRooms the total number of rooms in the hotel
     */
    public int getNumberOfRooms()
    {
        return numberOfRooms;
    }

    /**
     * Setter for number of rooms
     * @param numberOfRooms the total number of rooms in the hotel
     * @author Szymon Sztyrmer
     */
    public void setNumberOfRooms(int numberOfRooms)
    {
        this.numberOfRooms = numberOfRooms;
    }

    /**
     * This method allows for rooms to be added to the hotel
     * @param elements
     */
    public void addRoom(String [] elements)
    {
        for(int i = 0; i < Integer.parseInt(elements[2]); i++)
            roomList.add(new Room(elements));
        numberOfRooms += Integer.parseInt(elements[2]);
    }

    /**
     * The toString method
     * @return String of the hotel information.
     * @author Szymon Sztyrmer
     */
    public String toString()
    {
        return numberOfStars + " " + numberOfRooms;
    }
}