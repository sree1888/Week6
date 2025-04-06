import java.util.Scanner;
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Main class 
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = input.nextInt();
        System.out.println("Enter second number:");
        int b = input.nextInt();
        System.out.println("Enter third number:");
        int c = input.nextInt();


        Calculator calc = new Calculator();

        //  overloaded methods
        System.out.println("Add 2 integers: " + calc.add(a,b));
        System.out.println("Add 2 doubles: " + calc.add(a,b));
        System.out.println("Add 3 integers: " + calc.add(a,b,c));
    }
}


