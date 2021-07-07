package com.pbe;

/** Study on Autoboxing
 @author Pieter Beernink
 @version 1.0
 @since 1.0
 */

// *********************
// AUTOBOXING
// *********************
// Starting with an introduction on type wrappers
//
// Type wrappers
// Java primitive types such as int and double are no objects for the sake of performance.
// They are not part of the object hierarchy and do not inherit from Object.
// There are situations where an object representation is needed.
// For example to pass a primitive type by reference to a method or to use data structures to store primitive types.
// This is possible by using a 'type wrapper', which are classes that encapsulate a primitive type within an object.
// Available type wrappers: Character, Boolean, Byte, Short, Integer, Long, Float, and Double
//
// Character
// Is a wrapper around a char.
// Originally used the -as per JDK 9 deprecated- constructor: Character(char ch)
// Now recommended to use the static method valueOf() to obtain a Character object: static Character valueOf(char ch)
// This returns a Character object that wraps ch (the specified character).
// To have the encapsulated character in a Character object returned: char charValue()
//
// Boolean
// Is a wrapper around a boolean value.
// Originally used the -as per JDK 9 deprecated- constructors: Boolean(boolean boolValue) and Boolean(String boolString)
// Now recommended to use the static method valueOf() to obtain a Boolean object:
// static Boolean valueOf(boolean boolValue) and static Boolean valueOf(boolean boolString)
// Each returns a Boolean object that wraps the indicated value.
// To have the encapsulated boolean value in a Boolean object returned: boolean booleanValue()
//
// Numeric type wrappers
// Numeric type wrappers are the most commonly used type wrappers, being Byte, Short, Integer, Long, Float, and Double.
// All these wrappers inherit the abstract class Number.
// Number declares methods to return the value of an object in each of the different number formats: byte byteValue(), double doubleValue(), etc.
// Originally these type wrapper defined -as per JDK 9 deprecated- constructors  to construct an object from a given value or a string representation of that value.
// Also here it's now recommended to use one of the valueOf() methods to obtain a wrapper object. For example:
// static Integer value valueOf(int val)
// static Integer value valueOf(String valStr) throws NumberFormatException
//
// All of the type wrappers override toString(), returning the human-readable form of the value contained within the wrapper.
// This way, a value can be outputted by passing a type wrapper object to println(), without having to convert it into its primitive type.

// Autoboxing
// Since JDK5, Java offers autoboxing and auto-unboxing.
// Autoboxing is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes.
// If the conversion goes the other way, this is called unboxing.
// It is not necessary to manually construct an object in order to wrap a primitive type. The value only needs to be assigned to a type-wrapper reference.
// Example of the simplest form of autoboxing: Character ch = 'a'; or Integer iOb = 100;
// Auto(un)boxing helps streamline (algorithms) code, help prevent errors and are very important to generics.
// Auto(un)boxing also makes working with the Collections Framework much easier.
// Note that autoboxing/unboxing might also occur:
// - when an argument is passed to a method, or when a value is returned by a method
// - within expressions

public class Main {

    public static void main(String[] args) {

        // **********************
        // Example of type wrapper
        // **********************
        // Converting an int value into an Integer object
        System.out.println("Type wrapper example");
        int a = 10; // setting an int value

        Integer iOb = Integer.valueOf(a); // encapsulating the int value (=boxing) into an Integer object wrapper
        System.out.println("iOb value = " + iOb.intValue()); // displaying iOb value

        int b = iOb.intValue(); // storing iOb Integer value as int, essentially extracting the value from the wrapper (=unboxing)
        System.out.println("int b value = " + b + "\n"); // displaying int value

        // **********************
        // Example of type wrapper, using autoboxing/unboxing
        // **********************
        // Converting an int value into an Integer object
        System.out.println("Type wrapper example, using autoboxing/unboxing");
        int a2 = 10; // setting an int value

        Integer iOb2 = a; // autoboxing - encapsulating the int value into an Integer object wrapper
        System.out.println("iOb value = " + iOb); // displaying iOb value

        int b2 = iOb; // auto-unboxing - storing iOb Integer value as int
        System.out.println("int b value = " + b2 + "\n"); // displaying int value

        // **********************
        // Example of autoboxing/unboxing in method parameters and return value
        // **********************
        System.out.println("Autoboxing/unboxing in method parameters and return value");
        Integer iOb3 = autoboxme(100); // pass an int value to autoboxme() and assign the returned value to an Integer object, autoboxing it
        System.out.println(iOb3);  //
    }

    // **********************
    // Methods used in examples
    // **********************

    // Autoboxes receives value to Integer
    static int autoboxme(Integer x) {
        return x;
    }
}