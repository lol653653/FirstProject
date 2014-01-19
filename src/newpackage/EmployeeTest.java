package newpackage;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee emp = new Employee("Peter", "Parker", 5, "SpiderMan");
        // doSomethingWith(e);
        System.out.println("Employee's full name: "
                + emp.getFullName());
        System.out.println("Employee's Best Number: "
                + emp.getEmployeeId());
        System.out.println("Employee's Real Identity: "
                + emp.getCompanyName());
        // TODO: Array with random first/last names
    }

}
