package lesson30.task2;

import java.util.Collection;
import java.util.Date;
import java.util.Objects;

public class Firm implements Comparable<Firm> {

    private Date dateFounded;
    private Collection departments;
    private Collection customers;

    public Firm(Date dateFounded, Collection departments, Collection customers) {
        this.dateFounded = dateFounded;
        this.departments = departments;
        this.customers = customers;
    }

    public Date getDateFounded() {
        return dateFounded;
    }

    public Collection getDepartments() {
        return departments;
    }

    public Collection getCustomers() {
        return customers;
    }

    @Override
    public int compareTo(Firm fr) {
        return fr.dateFounded.compareTo(this.dateFounded);
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
