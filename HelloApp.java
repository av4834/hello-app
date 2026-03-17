/**
 * HelloApp - UC4
 * Displays greeting for multiple names or defaults to "World"
 */

public class HelloApp {
    public static void main(String[] args) {

        String name = "World";

        // If arguments are provided
        if (args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);

                // Add comma only if not last element
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }

            name = nameBuilder.toString();
        }

        System.out.println("Hello, " + name + "!");
    }
}
