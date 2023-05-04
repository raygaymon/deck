package sg.du.nus.iss;

import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        String file = args[0];

        File deck = new File(file);

        if (!deck.exists()) {

            deck.createNewFile();
            System.out.println("Deck created");
        }

        else {

            System.out.println("Deck loaded");
        }
    }
}
