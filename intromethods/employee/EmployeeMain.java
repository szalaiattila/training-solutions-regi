package intromethods.employee;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee employee = new Employee("Szalai Attila", 2019, 300000);

        System.out.println(employee);

        employee.raiseSalary(50000);

        System.out.println(employee);

        employee.setName("Szalai Attila");
        System.out.println("Name: " + employee.getName());
        System.out.println("Hiring year: " + employee.getHiringYear());
        System.out.println("Salary: " + employee.getSalary());
    }
}