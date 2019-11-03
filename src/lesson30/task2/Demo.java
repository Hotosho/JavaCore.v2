package lesson30.task2;


import java.util.Date;

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

        Firm firm1 = new Firm(new Date(2001, 01, 01));
        Firm firm2 = new Firm(new Date(2002, 02, 02));
        Firm firm3 = new Firm(new Date(2003, 03, 03));
        Firm firm4 = new Firm(new Date(2004, 04, 04));
        Firm firm5 = new Firm(new Date(2005, 05, 05));

        controller.getFirmDAO().addFirm(firm1);
        controller.getFirmDAO().addFirm(firm2);
        controller.getFirmDAO().addFirm(firm3);
        controller.getFirmDAO().addFirm(firm4);
        controller.getFirmDAO().addFirm(firm5);

        Project project1 = new Project("Apollo", CustomerDAO.addCustomer(customer1));
        Project project2 = new Project("GiperLupa", CustomerDAO.addCustomer(customer2));
        Project project3 = new Project("MadeInWroclaw", CustomerDAO.addCustomer(customer3));
        Project project4 = new Project("Toronto", CustomerDAO.addCustomer(customer4));
        Project project5 = new Project("Queen", CustomerDAO.addCustomer(customer5));

        controller.getProjectDAO().addProject(project1);
        controller.getProjectDAO().addProject(project2);
        controller.getProjectDAO().addProject(project3);
        controller.getProjectDAO().addProject(project4);
        controller.getProjectDAO().addProject(project5);

        //Employee employee1 = new Employee("Max", "Pain", new Date(), Position.TEAM_LEAD, new Department(DepartmentType.MANAGERS), ProjectDAO.getProjects(project1));


    }
}
