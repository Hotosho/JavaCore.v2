package lesson30.task2;


import java.util.Date;
import java.util.Objects;
import java.util.Set;

public class Firm {

    private Date dateFounded;
    private Set<Department> departments;
    private Set<Customer> customers;

    public Firm(Date dateFounded) {
        this.dateFounded = dateFounded;
    }

    public Date getDateFounded() {
        return dateFounded;
    }

    public Set<Department> getDepartments() {
        return departments;
    }

    public Set<Customer> getCustomers() {
        return customers;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Firm firm = (Firm) o;
        return Objects.equals(dateFounded, firm.dateFounded) &&
                Objects.equals(departments, firm.departments) &&
                Objects.equals(customers, firm.customers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateFounded, departments, customers);
    }

    @Override
    public String toString() {
        return "Firm{" +
                "dateFounded=" + dateFounded +
                ", departments=" + departments +
                ", customers=" + customers +
                '}';
    }
}
