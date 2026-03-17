/**
 * HelloApp.java
 * UC1: Display "Hello World"
 * UC2: Display "Hello" with user name
 * UC3: Display "Hello" with user name or default "World"
 */

public class HelloApp {
    public static void main(String[] args) {

        // Default value
        String name = "World";

        // Check if user provided a name
        if (args.length > 0) {
            name = args[0];
        }

        // Print greeting
        System.out.println("Hello, " + name + "!");
    }
}
