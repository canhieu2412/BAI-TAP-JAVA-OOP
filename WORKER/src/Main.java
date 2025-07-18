import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager();
        while (true){
            System.out.println("-------manage worker------");
            System.out.println("1. Add a Worker.");
            System.out.println("2. Increase salary for worker.");
            System.out.println("3. Decrease for worker. ");
            System.out.println("4. Show adjusted salary worker information.");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = validate.checkInputIntLimit(1,5);

            switch (choice) {
                case 1:
                    manager.addworker();
                    break;
                case 2:
                    manager.upsalary();
                    break;
                case 3:
                    manager.downsalary();
                    break;
                case 4:
                    manager.display();
                case 5:
                    System.exit(0);
            }
        }

    }
}