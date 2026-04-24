import java.util.Scanner;

public class QuantityMeasurementApp {


    static class Feet {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) return true;

            if (obj == null || getClass() != obj.getClass()) return false;

            Feet other = (Feet) obj;

            return Double.compare(this.value, other.value) == 0;
        }
    }


    static class Inches {
        private final double value;

        public Inches(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) return true;

            if (obj == null || getClass() != obj.getClass()) return false;

            Inches other = (Inches) obj;

            return Double.compare(this.value, other.value) == 0;
        }
    }

    public static boolean checkFeetEquality(double v1, double v2) {
        Feet f1 = new Feet(v1);
        Feet f2 = new Feet(v2);
        return f1.equals(f2);
    }


    public static boolean checkInchesEquality(double v1, double v2) {
        Inches i1 = new Inches(v1);
        Inches i2 = new Inches(v2);
        return i1.equals(i2);
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== UC2: Feet & Inches Measurement Equality ===");

        try {

            System.out.print("Enter first value in feet: ");
            double feet1 = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter second value in feet: ");
            double feet2 = Double.parseDouble(scanner.nextLine());


            System.out.print("Enter first value in inches: ");
            double inch1 = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter second value in inches: ");
            double inch2 = Double.parseDouble(scanner.nextLine());

            boolean feetResult = checkFeetEquality(feet1, feet2);
            boolean inchResult = checkInchesEquality(inch1, inch2);

            System.out.println("\n--- RESULTS ---");
            System.out.println("Feet comparison: " + (feetResult ? "Equal (true)" : "Not Equal (false)"));
            System.out.println("Inches comparison: " + (inchResult ? "Equal (true)" : "Not Equal (false)"));

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter numeric values only.");

        } finally {
            scanner.close();
            System.out.println("\nProgram execution completed.");
        }
    }
}