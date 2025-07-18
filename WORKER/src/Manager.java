import java.util.*;
public class Manager {
    private List<Worker> workers = new ArrayList<>();
    public void addworker(){
        System.out.print("Enter Code : ");
        String code = validate.checkInputString();
        System.out.print("Enter Name : ");
        String name = validate.checkInputString();
        System.out.print("Enter Age : ");
        int age = validate.checkInputInt();
        System.out.print("Enter Salary : ");
        double salary = validate.checkInputDouble();
        System.out.print("Enter Work Location : ");
        String work_location = validate.checkInputString();
        workers.add(new Worker(code,name,age,salary,work_location));
    }

    public void upsalary() {
        System.out.print("Enter Code : ");
        String code = validate.checkInputString();
        System.out.print("Enter Salary : ");
        double salary_up = validate.checkInputDouble();
        boolean found = false;
        for (Worker worker : workers) {
            if (worker.getCode().equals(code)) {
                worker.setSalary(worker.getSalary() + salary_up);
                System.out.println("Salary updated for " + worker.getName());
                found = true;
                break;
            }
        }if (!found) {
            System.out.println("Worker with code " + code + " not found.");
        }

    }
    public void downsalary() {
        System.out.print("Enter Code : ");
        String code = validate.checkInputString();
        System.out.print("Enter Salary : ");

        double salary_down = validate.checkInputDouble();
        boolean found = false;
        for (Worker worker : workers) {
            if (worker.getCode().equals(code)) {
                worker.setSalary(worker.getSalary() - salary_down);
                System.out.println("Salary updated for " + worker.getName());
                found = true;
                break;
            }
        }if (!found) {
            System.out.println("Worker with code " + code + " not found.");
        }
    }
    public void display() {
        System.out.println("--------------------Display Information Salary----------------------- ");
        for (Worker worker : workers) {
            System.out.println(worker.getCode());
            System.out.println(worker.getName());
            System.out.println(worker.getAge());
            System.out.println(worker.getSalary());

        }
    }
}
