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
Q24: Step 24: A HashMap is a collection class in Java that stores key-value pairs. It allows you to quickly look up a value if you know its key. You can add entries with put(key, value), retrieve values with get(key), and check for the existence of a key with containsKey(key).
Q25: HashMap is a parameterized class, meaning you specify the types of keys and values when you create it.
Q26: To check the number of entries in a HashMap, use the size() method. It returns the total number of key-value pairs currently stored.
Q27: Created MapTester class with a HashMap for storing names and phone numbers. Methods enterNumber and lookupNumber use put and get to add and retrieve entries.
Q28: If a key already exists, the old value gets replaced by the new value.
Q29:nA new key-value pair is added to the maps without affecting any other entries.
Q30: if (phoneBook.containsKey("Alice")) {
    System.out.println("Alice is in the phone book");
}
Q31: If you try to get a key that doesnt exist, get returns nulll. Example: String number = phoneBook.get("Bob"); // returns null because Bob is not in the map
Q32: You can print all keys using keySet(): It should be show this in the code 
for (String key : phoneBook.keySet()) {
    System.out.println(key);
}

