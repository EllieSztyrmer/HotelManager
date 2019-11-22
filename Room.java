//imports

/**
 * The Room class.
 * Each room has a type, min and max capacity and a base rate
 * @author Szymon Sztyrmer
 */
public class Room
{
    //Datafields
    private String typeOfRoom;
    private int minimumAdults;
    private int minimumChildren;
    private int maximumAdults;
    private int maximumChildren;

    /**
     * The constructor for each Room
     * @param elements of the room
     * @author Szymon Sztyrmer
     */
    public Room(String [] elements)
    {
        this.typeOfRoom = elements[1];
        splliter(elements);
    }

    /**
     * Getter of type of room
     * @return typeOfRoom
     * @author Szymon Sztyrmer
     */
    public String getTypeOfRoom()
    {
        return typeOfRoom;
    }

    /**
     * Getter for minimum adults
     * @return minimumAdults
     * @author Szymon Sztyrmer
     */
    public int getMinimumAdults()
    {
        return minimumAdults;
    }

    /**
     * Getter for minimum children
     * @return minimumChildren
     * @author Szymon Sztyrmer
     */
    public int getMinimumChildren()
    {
        return minimumChildren;
    }

    /**
     * Getter for maximum adults
     * @return maximumAdults
     * @author Szymon Sztyrmer
     */
    public int getMaximumAdults()
    {
        return maximumAdults;
    }

    /**
     * Getter for maximum children
     * @return maximumChildren
     * @author Szymon Sztyrmer
     */
    public int getMaximumChildren()
    {
        return maximumChildren;
    }

    /**
     * The to string to get all the information about any room
     * @return String with all information
     * @author Szymon Sztyrmer
     */
    public String toString()
    {
        return typeOfRoom + " " +
                    minimumAdults + " " +
                    minimumChildren + " " +
                    maximumAdults + " " +
                    maximumChildren;
    }
}