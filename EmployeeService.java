import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee emp) {
        employees.add(emp);
        System.out.println("Employee added successfully!");
    }

    public void listEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            for (Employee emp : employees) {
                System.out.println(emp);
            }
        }
    }

    public void updateEmployee(int id, String newName, String newDepartment, double newSalary) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                emp.setName(newName);
                emp.setDepartment(newDepartment);
                emp.setSalary(newSalary);
                System.out.println("Employee updated successfully!");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public void deleteEmployee(int id) {
        Employee toRemove = null;
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                toRemove = emp;
                break;
            }
        }
        if (toRemove != null) {
            employees.remove(toRemove);
            System.out.println("Employee removed successfully!");
        } else {
            System.out.println("Employee not found.");
        }
    }

    public void searchById(int id) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                System.out.println("Employee Found: " + emp);
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }
}
