TechSupport - the DodgySoft Technical support system.

This project is part of the material for the book

   Objects First with Java - A Practical Introduction using BlueJ
   Seventh edition
   David J. Barnes and Michael Kölling

This project is discussed in chapter 6.

This project aims to implements a technical support system for customers of 
the DodgySoft software company. Users can describe their software problems and 
get advice instantly!

The idea is based on Eliza - a famous program described by Joseph Weizenbaum 
in 1966. (Do a web search for "Eliza" and "Weizenbaum" if you want to know 
more about this.)

In fact, it is much more primitive than Eliza. But that's enough to match the 
quality of many software companies' technical support advice...  ;-)

To start this program, create a SupportSystem object and execute the "start" 
method.

Then start describing your problem by typing in the terminal window.

The purpose of this project is to demonstrate and study library classes, such 
as ArrayList, HashMap, HashSet, and Random.

This project is only a first, rudimentary step towards the full solution.

Part 2 -

Q24: A HashMap is a collection class in Java that stores key-value pairs. It allows you to quickly look up a value. You can add entries with 'put(key, value)' and retrieve values with 'get(key)', and to check for an existence of a key with 'containsKey(key)'.

Q25: HashMap is a parameterized class, meaning you specify the types of keys and values when you create it.

Q26: To check the number of entries in HashMap, use the 'size()' method. This will return the total number of key-value pairs currently stored.

Q27: I created MapTester class with a HashMap for storing names and phone numbers. Methods 'enterNumber' and 'lookupNumber' are used to put, get to add and retrieve entries.

Q28: If a key already exists, the old value gets replaced by the new value.

Q29: A new key-value pair is added to the maps without affecting any other entries.

Q30: if (phoneBook.containsKey("Alice")) {
    System.out.println("Alice is in the phone book");
}

Q31: If you try to get a key that doesnt exist, get returns nulll. 
Example: String number = phoneBook.get("Bob"); // returns null because Bob is not in the map

Q32: You can print all keys using 'keySet():' 
It should be show this in the code:
(String key : phoneBook.keySet()) {
    System.out.println(key);
}

Q33: I changed the Responder class to use a 'HashMap<String, String>' where keys are known words and values are responses. I created a 'fillResponsesMap()' method to populate the map. I also updated 'generateResponse(String word)' to return the associated response for the word', or a default response if the word is not in the map.

Q34: A HashSet stores unique elements only, unordered, no duplicates allowed and no guaranteed order of elements. An ArrayList only stores elements in order, duplicates allowed, maintains insertion order. 
They have a few similarites between them which are thatmthey are both collections, they can store objects and support iterations. 
The differences are that an ArrayList allows duplicates and keeps order, while a HashSet doesnt allow duplicates and has no order guarantee. 

Q35: From a HashSet the order is unpredicatble and from an ArrayList the order is the same.

Q36: If you split the string on " " (space), multiple consecutive spaces can create empty strings in your array. We can use 'input.trim().split("\\s+")' → removes leading/trailing spaces and treats multiple spaces as one.

Q37: Modified the SupportSystem and Responder classes so that input is now treated as a set of words (HashSet<String>) instead of a single string. This will allow the system to check each word against the map of known words and returns the associated response if any word matches. If none of the words are recognized, a default response is returned, which allows the system to handle multiple words in the uses input more efficiently.

Q38: Added more word/response mappings into the application to make it respond to a wider range of user inputs. I added "slow", "crash" and "bug".

Q39: To make sure the same default response is never repeated twice in a row, the program stores the last default response in a variable. Before returning a new default, it would check if it is the same as the previous one if so, it would pick another option to guarantee variety.

Q40: If two words are variations like synonyms should map to the same response the HashMap be designed so multiple keys point to the same value.

Q41: When multiple words from the user input are recognized, the program could enhance its response logic to either combine multiple responses or prioritize one. 

Q42:When no word is recognized, instead of returning a random default response, the system could analyze the input further. Certain unrecognized words (like “why,” “how,” or “who”) could be used to choose a more fitting default. This would make the system feel more natural and context-aware.
