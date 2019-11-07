package lesson30.task2;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {

        Controller controller = new Controller();

        Customer customer1 = new Customer("USAPresident", "USA", 99999999);
        Customer customer2 = new Customer("UAPresident", "UA", 10000);
        Customer customer3 = new Customer("PLPresident", "PL", 34244244);
        Customer customer4 = new Customer("CAPrimeMinister", "CA", 8989889);
        Customer customer5 = new Customer("ENGPrimeMinister", "ENG", 8765434);

        controller.getCustomerDAO().addCustomer(customer1);
        controller.getCustomerDAO().addCustomer(customer2);
        controller.getCustomerDAO().addCustomer(customer3);
        controller.getCustomerDAO().addCustomer(customer4);
        controller.getCustomerDAO().addCustomer(customer5);

        Firm firm1 = new Firm(new Date());
        Firm firm2 = new Firm(new Date());
        Firm firm3 = new Firm(new Date());
        Firm firm4 = new Firm(new Date());
        Firm firm5 = new Firm(new Date());

        controller.getFirmDAO().addFirm(firm1);
        controller.getFirmDAO().addFirm(firm2);
        controller.getFirmDAO().addFirm(firm3);
        controller.getFirmDAO().addFirm(firm4);
        controller.getFirmDAO().addFirm(firm5);

        Project project1 = new Project("Apollo", customer1);
        Project project2 = new Project("GiperLupa", customer2);
        Project project3 = new Project("MadeInWroclaw", customer3);
        Project project4 = new Project("Toronto", customer4);
        Project project5 = new Project("Queen", customer5);

        controller.getProjectDAO().addProject(project1);
        controller.getProjectDAO().addProject(project2);
        controller.getProjectDAO().addProject(project3);
        controller.getProjectDAO().addProject(project4);
        controller.getProjectDAO().addProject(project5);


        Employee employee1 = new Employee("Max", "Pain", new Date(), Position.TEAM_LEAD,
                new Department(DepartmentType.MANAGERS), ProjectDAO.getProjects());
        Employee employee2 = new Employee("Ilon", "Task", new Date(), Position.TEAM_LEAD,
                new Department(DepartmentType.MANAGERS), ProjectDAO.getProjects());
        Employee employee3 = new Employee("Bill", "Gatc", new Date(), Position.TEAM_LEAD,
                new Department(DepartmentType.MANAGERS), ProjectDAO.getProjects());
        Employee employee4 = new Employee("Leo", "Messi", new Date(), Position.DEVELOPER,
                new Department(DepartmentType.DEVELOPERS), ProjectDAO.getProjects());
        Employee employee5 = new Employee("Cristiano", "Ronaldo", new Date(), Position.DEVELOPER,
                new Department(DepartmentType.DEVELOPERS), ProjectDAO.getProjects());
        Employee employee6 = new Employee("Harry", "Kaine", new Date(), Position.DEVELOPER,
                new Department(DepartmentType.DEVELOPERS), ProjectDAO.getProjects());
        Employee employee10 = new Employee("Rikardo", "Karvaelo", new Date(), Position.DEVELOPER,
                new Department(DepartmentType.DEVELOPERS), ProjectDAO.getProjects());
        Employee employee11 = new Employee("Pompadyr", "Idiotow", new Date(), Position.DEVELOPER,
                new Department(DepartmentType.DEVELOPERS), ProjectDAO.getProjects());
        Employee employee7 = new Employee("Pep", "Gwardiola", new Date(), Position.FINANCE,
                new Department(DepartmentType.FINANCE), ProjectDAO.getProjects());
        Employee employee8 = new Employee("Enrike", "Iglesijas", new Date(), Position.FINANCE,
                new Department(DepartmentType.FINANCE), ProjectDAO.getProjects());
        Employee employee9 = new Employee("Rodzer", "Federer", new Date(), Position.FINANCE,
                new Department(DepartmentType.FINANCE), ProjectDAO.getProjects());
        Employee employee12 = new Employee("Pablo", "Pikasso", new Date(), Position.DESIGNER,
                new Department(DepartmentType.DESIGNERS), ProjectDAO.getProjects());

        controller.getEmployeeDAO().addEmployee(employee1);
        controller.getEmployeeDAO().addEmployee(employee2);
        controller.getEmployeeDAO().addEmployee(employee3);
        controller.getEmployeeDAO().addEmployee(employee4);
        controller.getEmployeeDAO().addEmployee(employee5);
        controller.getEmployeeDAO().addEmployee(employee6);
        controller.getEmployeeDAO().addEmployee(employee7);
        controller.getEmployeeDAO().addEmployee(employee8);
        controller.getEmployeeDAO().addEmployee(employee9);
        controller.getEmployeeDAO().addEmployee(employee10);
        controller.getEmployeeDAO().addEmployee(employee11);





        System.out.println(controller.employeesByDepartmentWithoutProject(DepartmentType.DEVELOPERS));



    }
}
