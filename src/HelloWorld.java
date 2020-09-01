import java.util.Scanner;

public class HelloWorld {
    public void greet() {
        String greeting = "Hello";
        System.out.println(greeting + "World");
    }

    public static void main(String [] args) {
        System.out.println("In main");

        Scanner scan = new Scanner(System.in);

        System.out.print("Type in your name:");
        String name = scan.nextLine();

        System.out.printf("%s", name);

    }
}
