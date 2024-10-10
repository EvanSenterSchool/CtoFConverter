import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double celsius = 0;
        double fahrenheit;
        boolean valid = false;


        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Please enter your temperature in celsius to be converted to fahrenheit");
            if (scan.hasNextDouble()) {
                celsius = scan.nextDouble();

                if (celsius >= -273.15) {
                    valid = true;
                } else {
                    System.out.println("You have entered an incorrect temperature");
                }
            } else {
                scan.nextLine();
                System.out.println("You Must enter a valid temperature");
            }


        } while (!valid);


        fahrenheit = (celsius * 1.8) + 32;

        System.out.printf("%-13s %-6.2f","Degrees C:",celsius);
        System.out.printf("\n%-13s %-6.2f","Degrees F:",fahrenheit);
    }
}