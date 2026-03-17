public class HelloApp {
    public static void main(String[] args) {

        String finalNames = "World";

        if (args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;

            for (String name : args) {
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(name);
                first = false;
            }

            finalNames = nameBuilder.toString();
        }

        System.out.println("Hello, " + finalNames + "!");
    }
}

