import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("========= Doctor Management ==========");
            System.out.println("1. Add Doctor");
            System.out.println("2. Update Doctor");
            System.out.println("3. Delete Doctor");
            System.out.println("4. Search Doctor");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = Validate.checkInputIntLimit(1, 5);

            switch (choice) {
                case 1:
                    manager.addDoctor();
                    break;
                case 2:
                    manager.updateDoctor();
                    break;
                case 3:
                    manager.deleteDoctor();
                    break;
                case 4:
                    manager.searchDoctor();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    return;
            }
            System.out.println();
        }
    }
}
