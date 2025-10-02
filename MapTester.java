import java.util.HashMap;
/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is returned.
 * It interacts with the user via text input/output and provides automated responses.
 * 
 * @author Eimaan Akhtar
 * @version 1.0
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 7.0
 */
public class MapTester {
    private HashMap<String, String> phoneBook;

    public MapTester() {
        phoneBook = new HashMap<>();
    }

    public void enterNumber(String name, String number) {
        phoneBook.put(name, number);
    }

    public String lookupNumber(String name) {
        return phoneBook.get(name);
    }
}
