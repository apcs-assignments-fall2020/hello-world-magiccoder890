import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        // Write some code here!
        Scanner scan = new Scanner(System.in);
		System.out.print("What is your name ");
		String name = scan.next();
        System.out.println("Hello " + name + ". Nice to meet you");
        Scanner scan2 = new Scanner(System.in);
        System.out.print("What is your favorite color," + name + "?");
        String color = scan2.next();
        System.out.println("Oh,I love " + color + " too");
    }
}
