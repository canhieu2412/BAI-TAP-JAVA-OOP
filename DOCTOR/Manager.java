import java.util.*;

public class Manager {
    private HashMap<String, Doctor> doctors = new HashMap<>();

    public void addDoctor() {
        System.out.print("Enter Code: ");
        String code = Validate.checkInputString();
        if (doctors.containsKey(code)) {
            System.out.println("Doctor code [" + code + "] is duplicate");
            return;
        }

        System.out.print("Enter Name: ");
        String name = Validate.checkInputString();
        System.out.print("Enter Specialization: ");
        String specialization = Validate.checkInputString();
        System.out.print("Enter Availability: ");
        int availability = Validate.checkInputInt();

        Doctor doctor = new Doctor(code, name, specialization, availability);
        doctors.put(code, doctor);
        System.out.println("Doctor added successfully.");
    }

    public void updateDoctor() {
        System.out.print("Enter Code: ");
        String code = Validate.checkInputString();
        Doctor doctor = doctors.get(code);
        if (doctor == null) {
            System.out.println("Doctor code does not exist.");
            return;
        }

        System.out.print("Enter Name: ");
        String name = Validate.checkInputString();
        System.out.print("Enter Specialization: ");
        String specialization = Validate.checkInputString();
        System.out.print("Enter Availability: ");
        int availability = Validate.checkInputInt();

        doctor.setName(name);
        doctor.setSpecialization(specialization);
        doctor.setAvailability(availability);

        System.out.println("Doctor updated successfully.");
    }

    public void deleteDoctor() {
        System.out.print("Enter Code: ");
        String code = Validate.checkInputString();
        if (!doctors.containsKey(code)) {
            System.out.println("Doctor code does not exist.");
            return;
        }
        doctors.remove(code);
        System.out.println("Doctor deleted successfully.");
    }

    public void searchDoctor() {
        System.out.print("Enter Code: ");
        String input = Validate.checkInputString();
        System.out.printf("%-10s%-15s%-20s%-10s\n", "Code", "Name", "Specialization", "Availability");
        for (Doctor doctor : doctors.values()) {
            if (doctor.contains(input)) {
                System.out.println(doctor);
            }
        }
    }
}
