package labsession25;

class Employee {
    public void work() {
        System.out.println("Employee");
    }

    public double getSalary() {
        return 30000.0;
    }
}
class HRManager extends Employee {
    public void work() {
        System.out.println("HR Manager");
    }

    public void addEmployee() {
        System.out.println("New employee");
    }
}
public class Question3 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.work();
        System.out.println(emp.getSalary());

        HRManager hr = new HRManager();
        hr.work();
        System.out.println(hr.getSalary());
        hr.addEmployee();
    }
}



