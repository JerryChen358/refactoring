package theater;

import java.util.List;

/**
 * Class representing an invoice for a customer.
 */
public class Invoice {
    private final String customer;
    private final List<Performance> performances;

    public Invoice(String customerName, List<Performance> performances1) {
        this.customer = customerName;
        this.performances = performances1;
    }

    public final String getCustomer() {
        return customer;
    }

    public final List<Performance> getPerformances() {
        return performances;
    }
}
