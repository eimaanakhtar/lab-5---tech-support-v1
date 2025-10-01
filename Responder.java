import java.util.HashMap;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 7.0
 */
public class Responder
{
    private HashMap<String, String> responses;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder() {
        responses = new HashMap<>();
        fillResponsesMap(); // populate the map when object is created
    }
    
    private void fillResponsesMap() {
        responses.put("hello", "Hi there!");
        responses.put("bye", "Goodbye");
        responses.put("thanks", "You're welcome!");
    }
    
    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String word)
    {
        String response = responses.get(word);
        if (response == null) {
            response = pickDefaultResponse();
        }
        return response;
    }
    
    private String pickDefaultResponse() {
        return "I dont understand.";
    }
}

