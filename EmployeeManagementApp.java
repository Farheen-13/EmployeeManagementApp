import java.util.Scanner;

public class EmployeeManagementApp {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    EmployeeService service = new EmployeeService();

    while (true) {
      System.out.println("\nEmployee Management System");
      System.out.println("1. Add Employee");
      System.out.println("2. Display All Employees");
      System.out.println("3. Search Employee by ID");
      System.out.println("4. Exit");
      System.out.print("Enter your choice: ");

      int choice = scanner.nextInt();
      scanner.nextLine(); // consume newline

      switch (choice) {
        case 1:
          System.out.print("Enter ID: ");
          int id = scanner.nextInt();
          scanner.nextLine(); // consume newline
          System.out.print("Enter Name: ");
          String name = scanner.nextLine();
          System.out.print("Enter Department: ");
          String dept = scanner.nextLine();
          System.out.print("Enter Salary: ");
          double salary = scanner.nextDouble();

          Employee emp = new Employee(id, name, dept, salary);
          service.addEmployee(emp);
          break;

        case 2:
          service.displayAll();
          break;

        case 3:
          System.out.print("Enter ID to search: ");
          int searchId = scanner.nextInt();
          service.searchById(searchId);
          break;

        case 4:
          System.out.println("Exiting...");
          scanner.close();
          System.exit(0);

        default:
          System.out.println("Invalid choice. Try again.");
      }
    }
  }
}

