/*
Class is an blueprint of the objects we wants to create(Blueprint of creating real world objects).
*/

import java.util.Scanner;

public class Animal {
    /*
    public is keyword means anyone can assess it.
    static means that this can be share values with animals which are created.
    Below is known as field.
    final is constant. final should be declared in caps.
    double is variable type.
    variable can start with _, $ ot letter
    private is variable and methods that are accessed to that class only.
    */
    public static final double FAVNUMBER = 1.6980;
    private String name;
    /*
    int range -2^31 to 2^31
    byte range -128 to 127
    long range -2^63 to 2^63
    weight is an attribute to the class.
    char unsigned ints  that represent UTF-16 codes, single chars
    double is a 64bit number with decimals.
    floats is 32bit with decimals. floats are not accurate.
    */
    private int weight;
    private boolean hasOwner = false;
    private byte age;
    private long uniqueID;
    private char favoriteChar;
    private double speed;
    private float height;
    /*
    protected only access to the same package code.
    static is going to share same value to every single animal objects.
    when u want to mark any variable or method to the object on its own we use static.
    it doesn't make sense to dog to know its
    variable and methods ex: what dog does with real world objects numberOfAnimals created!!!
     When it doesn't make sense to add to some objects make static.
     */
    protected static int numberOfAnimals = 0;
    //System.in is the data we want from keyboard.
    static Scanner scan = new Scanner(System.in);

    /*
    When ever you need to create the object of the class you need to be created we need constructor.

    super call whatever the Super class WAS of this animal.
     */
    public Animal() {
        super();
        //testing
    }
    
    
}
