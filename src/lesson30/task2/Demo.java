package lesson30.task2;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.function.ToDoubleBiFunction;

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

        HashSet<Project> setProject1 = new HashSet<>();


        HashSet<Project> setProject2 = new HashSet<>();
        setProject2.add(new Project("Apollo", customer1));

        HashSet<Project> setProject3 = new HashSet<>();
        setProject3.add(new Project("GiperLupa", customer2));

        HashSet<Project> setProject4 = new HashSet<>();
        setProject4.add(new Project("MadeInWroclaw", customer3));

        HashSet<Project> setProject5 = new HashSet<>();
        setProject5.add(new Project("Toronto", customer4));

        HashSet<Project> setProject6 = new HashSet<>();
        setProject6.add(new Project("Queen", customer5));

        HashSet<Project> setProject7 = new HashSet<>();
        setProject7.add(new Project("Barsa", customer1));

        /*Project project1 = new Project("Apollo", customer1);
        Project project2 = new Project("GiperLupa", customer2);
        Project project3 = new Project("MadeInWroclaw", customer3);
        Project project4 = new Project("Toronto", customer4);
        Project project5 = new Project("Queen", customer5);

        controller.getProjectDAO().addProject();
        controller.getProjectDAO().addProject(project2);
        controller.getProjectDAO().addProject(project3);
        controller.getProjectDAO().addProject(project4);
        controller.getProjectDAO().addProject(project5);*/


        Employee employee1 = new Employee("Max", "Pain", new Date(), Position.TEAM_LEAD,
                new Department(DepartmentType.MANAGERS), setProject7);
        Employee employee2 = new Employee("Ilon", "Task", new Date(), Position.TEAM_LEAD,
                new Department(DepartmentType.MANAGERS), setProject2);
        Employee employee3 = new Employee("Bill", "Gatc", new Date(), Position.TEAM_LEAD,
                new Department(DepartmentType.MANAGERS), setProject3);
        Employee employee4 = new Employee("Leo", "Messi", new Date(), Position.DEVELOPER,
                new Department(DepartmentType.DEVELOPERS), setProject1);
        Employee employee5 = new Employee("Cristiano", "Ronaldo", new Date(), Position.DEVELOPER,
                new Department(DepartmentType.DEVELOPERS), setProject4);
        Employee employee6 = new Employee("Harry", "Kaine", new Date(), Position.DEVELOPER,
                new Department(DepartmentType.DEVELOPERS), setProject7);
        Employee employee10 = new Employee("Rikardo", "Karvaelo", new Date(), Position.DEVELOPER,
                new Department(DepartmentType.DEVELOPERS), setProject5);
        Employee employee11 = new Employee("Pompadyr", "Idiotow", new Date(), Position.DEVELOPER,
                new Department(DepartmentType.DEVELOPERS), setProject6);
        Employee employee7 = new Employee("Pep", "Gwardiola", new Date(), Position.FINANCE,
                new Department(DepartmentType.FINANCE), setProject7);
        Employee employee8 = new Employee("Enrike", "Iglesijas", new Date(), Position.FINANCE,
                new Department(DepartmentType.FINANCE), setProject4);
        Employee employee9 = new Employee("Rodzer", "Federer", new Date(), Position.FINANCE,
                new Department(DepartmentType.FINANCE), setProject6);
        Employee employee12 = new Employee("Pablo", "Pikasso", new Date(), Position.DESIGNER,
                new Department(DepartmentType.DESIGNERS), setProject7);

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
        controller.getEmployeeDAO().addEmployee(employee12);

        HashSet<Employee> dev = new HashSet<>();
        dev.add(employee4);
        dev.add(employee5);
        dev.add(employee6);
        dev.add(employee10);
        dev.add(employee11);

        HashSet<Employee> prMan = new HashSet<>();
        prMan.add(employee1);
        prMan.add(employee2);
        prMan.add(employee3);

        HashSet<Employee> fin = new HashSet<>();
        fin.add(employee7);
        fin.add(employee8);
        fin.add(employee9);

        Department developer = new Department(DepartmentType.DEVELOPERS, dev);
        Department projectManager = new Department(DepartmentType.MANAGERS, prMan);
        Department depFinance = new Department(DepartmentType.FINANCE, fin);

        DepartmentDAO.getDepartments().add(developer);
        DepartmentDAO.getDepartments().add(projectManager);
        DepartmentDAO.getDepartments().add(depFinance);

        //TODO
        // не рабоает как в ТЗ
        System.out.println("список сотрудников, работающих над заданным проектом");
        System.out.println(controller.employeesByProject("Apollo"));

        System.out.println("**************");
        //TODO
        // не рабоает как в ТЗ
        System.out.println("список сотрудников из заданного отдела, не участвующих ни в одном проекте");
        System.out.println(controller.employeesByDepartmentWithoutProject(DepartmentType.DEVELOPERS));

        System.out.println("**************");

        System.out.println("список проектов, в которых участвует заданный сотрудник");//+++
        System.out.println(controller.projectsByEmployee(employee1));

        System.out.println("**************");
        //TODO
        // не рабоает как в ТЗ
        System.out.println("список сотрудников, не участвующих ни в одном проекте");
        System.out.println(controller.employeesWithoutProject());

        System.out.println("**************");
        //TODO
        // не рабоает как в ТЗ
        System.out.println("список подчиненных для заданного руководителя (по всем проектам, которыми он руководит)");
        System.out.println(controller.employeesByTeamLead(employee1));

        System.out.println("**************");
        //TODO
        // не рабоает как в ТЗ
        System.out.println("список руководителей для заданного сотрудника (по всем проектам, в которых он участвует");
        System.out.println(controller.teamLeadsByEmployee(employee7));

        System.out.println("**************");
        //TODO
        // не рабоает как в ТЗ
        System.out.println("список сотрудников, участвующих в тех же проектах, что и заданный сотрудник");
        System.out.println(controller.employeesByProjectEmployee(employee1));

        System.out.println("**************");
        //TODO
        // не рабоает как в ТЗ
        System.out.println("список сотрудников, участвующих в проектах, выполняемых для заданного заказчика");
        System.out.println(controller.employeesByCustomerProjects(customer1));

        System.out.println("**************");
        //TODO
        // не рабоает как в ТЗ
        System.out.println("список проектов, выполняемых для заданного заказчика");
        System.out.println(controller.projectsByCustomer(customer1));



    }
}
