//The imports go here
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * The main driver for the application
 * @author Szymon Sztyrmer - 17200296
 * This is a hotel manager app
 * It will allow 3 types of "accounts" to do 3 types of things
 */

public class HotelManager
{
    /**
     * The main method that the program starts from
     * @param args the command line array
     * @author Szymon Sztyrmer
     * This is the start and a few things will start from here
     */
    public static void main (String [] args) throws IOException
    {
        //First things first, some variables that I will be using.
        ArrayList<Hotel> hotels = new ArrayList<Hotel>();
        String firstTwoLines = "";
        
        //Now to read the csv file
        loadFile(hotels);
    }

    /**
     * The Method responsible for the initial load of the csv file into the system
     * @author Szymon Sztyrmer
     * Reads the csv one line at a time, and places the line in a string then does something to that string.
     */
    public static void loadFile(ArrayList<Hotel> hotels) throws IOException
    {
        //Some variables for the method
        File csvData = new File("l4hotels.csv");
        Scanner in = new Scanner(csvData);
        String lineFromCsv = "";
        String firstTwoLines = "";
        int currentHotel = 0;

        //Okay i guess I'll preserve the first 2 lines...
        for(int i = 0; i < 2; i++)
            firstTwoLines += in.nextLine();

        //Now read the file line by line
        while(in.hasNext())
        {
            lineFromCsv = in.nextLine();
            //System.out.println(lineFromCsv);
            createHotels(hotels, lineFromCsv, currentHotel);
        }
    }

    /**
     * The method that will create the hotels
     * @param hotels List of hotels
     * @param lineFromCsv The line from the file
     * @author Szymon Sztyrmer
     */
    public static int createHotels(ArrayList<Hotel> hotels, String lineFromCsv, int currentHotel)
    {
        //Variables
        String [] elements;
        String starPattern = "[3-5]{1}";
        Hotel hotel;

        //Split the string into an array for access
        elements = lineFromCsv.split(",");
        //Next check if the 1st element is a number
        if(elements[0].matches(starPattern))
        {
            //If it is, create a new hotel
            hotel = new Hotel(elements[0]);
            hotel.addRoom(elements);
            hotels.add(hotel);
            currentHotel++;
        }
        else
        {
            //If not add to the current hotel
            hotels.get(currentHotel - 1).addRoom(elements);
        }
        return currentHotel;
    }
}