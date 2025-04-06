import java.util.Scanner;
class Vehicle {
    public void displayInfo() {
        System.out.println("This is a vehicle");
    }
}

class Car extends Vehicle {
    String car_colour, car_model;
    int car_prize, seating_capacity;
    boolean petrol_or_not;

    // Constructor
    Car(String car_colour, String car_model, int car_prize, int seating_capacity, boolean petrol_or_not) {
        this.car_colour = car_colour;
        this.car_model = car_model;
        this.car_prize = car_prize;
        this.seating_capacity = seating_capacity;
        this.petrol_or_not = petrol_or_not;
    }

    // Overriding the displayInfo method
    @Override
    public void displayInfo() {
        System.out.println("Car colour: " + car_colour);
        System.out.println("Car model: " + car_model);
        System.out.println("Car price: " + car_prize);
        System.out.println("Car seating capacity: " + seating_capacity);
        System.out.println("Is car petrol or not: " + petrol_or_not);
    }
}

public class Vechicles{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter car colour");
        String car_colour = sc.nextLine();
        System.out.println("Enter car model");
        String car_model = sc.nextLine();
        System .out.println("Enter car price");
        int car_prize = sc.nextInt();
        System.out.println("Enter car seating capacity");
        int seating_capacity = sc.nextInt();
        System.out.println("Is car petrol or not");
        boolean petrol_or_not = sc.nextBoolean();
        sc.nextLine();
        Car car = new Car(car_colour, car_model, car_prize, seating_capacity, petrol_or_not);
        car.displayInfo();

       
    }
}
