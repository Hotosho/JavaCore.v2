package lesson35.model;

import java.util.Date;

public class Order {
    private long id;
    private User user;
    private Room room;
    private Date dateForm;
    private Date dateTo;
    private Double moneyPaid;

    public Order(long id, User user, Room room, Date dateForm, Date dateTo, Double moneyPaid) {
        this.id = id;
        this.user = user;
        this.room = room;
        this.dateForm = dateForm;
        this.dateTo = dateTo;
        this.moneyPaid = moneyPaid;
    }
}
