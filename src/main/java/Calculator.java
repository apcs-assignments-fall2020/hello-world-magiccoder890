import java.util.Scanner;

public class Calculator {
    public static int median(int a,int b, int c) {
        int sum = a + b + c;
        int max_number_firsttwo = Math.max(a,b);
        int max_number = Math.max(max_number_firsttwo,c);
        int min_number_firsttwo = Math.min(a,b);
        int min_number = Math.min(min_number_firsttwo,c);
        int median_number = sum - max_number - min_number;
        System.out.println(median_number);
        return median_number;
    }

    public static int magnitude(int a, int b) {
        int ab_a = Math.abs(a);
        int ab_b = Math.abs(b);
        if (Math.max(ab_a, ab_b) == ab_a) {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
        return ab_a;
    }

    public static int pythagoras(int a, int b) {
        int c_sq = (int) (Math.pow((a+b),2) - 2*a*b);
        System.out.println(c_sq);
        return c_sq;
    }

    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);
        System.out.print("What command would you like to carry out");
        String command = scanner.next();
        if (command.equals("median")) {
            System.out.print("What's the first number");
            int a = scanner.nextInt();
            System.out.print("What's the second number");
            int b = scanner.nextInt();
            System.out.print("What's the third number");
            int c= scanner.nextInt();
            median(a, b, c);
        }
        else if (command.equals("magnitude")) {
            System.out.print("What's the first number");
            int a = scanner.nextInt();
            System.out.print("What's the second number");
            int b = scanner.nextInt();
            magnitude(a , b);
        }
        else if (command.equals("pythagoras")){
            System.out.print("What's the first number");
            int a = scanner.nextInt();
            System.out.print("What's the second number");
            int b = scanner.nextInt();
            pythagoras(a, b);
        }
        else {
            System.out.println("There are some errors:)");
        }
    }

}