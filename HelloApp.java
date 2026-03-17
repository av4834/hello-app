public class HelloApp {
    public static void main(String[] args) {

        String name = "World";

        if (args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();

            for (String s : args) {
                nameBuilder.append(s).append(", ");
            }

            if (nameBuilder.length() > 0) {
                name = nameBuilder.substring(0, nameBuilder.length() - 2);
            }
        }

        System.out.println("Hello, " + name + "!");
    }
}
