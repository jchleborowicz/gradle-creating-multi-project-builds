package greeter;

public class Greeter {
    public static void main(String[] args) {
        final String name = args[0];

        final String greeting = GreetingFormatter.greeting(name);

        System.out.println(greeting);
    }
}
