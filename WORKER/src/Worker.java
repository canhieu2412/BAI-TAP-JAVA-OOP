public class Worker {
    private String code;
    private String name;
    private int age;
    private double salary;
    private String work_location;

    public Worker(String code, String name, int age, double salary, String work_location) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.work_location = work_location;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getWork_location() {
        return work_location;
    }
    public void setWork_location(String work_location) {
        this.work_location = work_location;
    }

    public String toString() {
        return "Worker{" + "code=" + code + ", name=" + name + ", age=" + age  + ", salary=" + salary + ", work_location=" + work_location + '}';
    }
}
