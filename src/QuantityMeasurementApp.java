import java.util.Scanner;

public class QuantityMeasurementApp {


    static class Feet {
        private final double value;


        public Feet(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }


        @Override
        public boolean equals(Object obj) {


            if (this == obj) {
                return true;
            }


            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }


            Feet other = (Feet) obj;


            return Double.compare(this.value, other.value) == 0;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== UC1: Feet Measurement Equality ===");

        try {

            System.out.print("Enter first value in feet: ");
            double value1 = Double.parseDouble(scanner.nextLine());


            System.out.print("Enter second value in feet: ");
            double value2 = Double.parseDouble(scanner.nextLine());


            Feet feet1 = new Feet(value1);
            Feet feet2 = new Feet(value2);


            boolean result = feet1.equals(feet2);


            if (result) {
                System.out.println("Output: Equal (true)");
            } else {
                System.out.println("Output: Not Equal (false)");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter numeric values only.");
        } finally {
            scanner.close();
            System.out.println("Program execution completed.");
        }
    }
}