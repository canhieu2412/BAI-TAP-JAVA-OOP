import java.util.Scanner;

public class validate {
    private final static Scanner in = new Scanner(System.in);

    public static String checkInputString() {
        while (true) {
            String result = in.nextLine().trim();
            if (!result.isEmpty()) {
                return result;
            }
            System.out.print("Input cannot be empty. Enter again: ");
        }
    }

    public static int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine());
                if (result >= min && result <= max) {
                    return result;
                }
                System.out.print("Please input number in range [" + min + ", " + max + "]: ");
            } catch (NumberFormatException e) {
                System.out.print("Input must be an integer. Enter again: ");
            }
        }
    }

    public static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine());
                if (result >= 0) return result;
                System.out.print("Availability must be >= 0. Enter again: ");
            } catch (NumberFormatException e) {
                System.out.print("Input must be an integer. Enter again: ");
            }
        }
    }
    public static double checkInputDouble() {
        while (true) {
            try {
                double result = Double.parseDouble(in.nextLine());
                if (result >= 0) return result;
                System.out.print("Availability must be >= 0. Enter again: ");
            } catch (NumberFormatException e) {
                System.out.print("Input must be an integer. Enter again: ");
            }
        }
    }
}
