import java.util.Scanner;

// Car Interface
interface Car {
    void startCar();
    void stopCar();
}

// Bike Interface
interface Bike {
    void startBike();
    void stopBike();
}

// Vehicle class implementing both interfaces
class Vehicle implements Car, Bike {

    public void startCar() {
        System.out.println("Car started.");
    }

    public void stopCar() {
        System.out.println("Car stopped.");
    }

    public void startBike() {
        System.out.println("Bike started.");
    }

    public void stopBike() {
        System.out.println("Bike stopped.");
    }
}

// Main class with switch-case
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle v = new Vehicle();
        int choice;

        do {
            System.out.println("\nEnter your choice:");
            System.out.println("1. Start Car");
            System.out.println("2. Stop Car");
            System.out.println("3. Start Bike");
            System.out.println("4. Stop Bike");
            System.out.println("5. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    v.startCar();
                    break;
                case 2:
                    v.stopCar();
                    break;
                case 3:
                    v.startBike();
                    break;
                case 4:
                    v.stopBike();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}
