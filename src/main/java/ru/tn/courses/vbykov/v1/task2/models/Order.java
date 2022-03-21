package ru.tn.courses.vbykov.v1.task2.models;
import java.time.LocalDate;

public class Order extends Model {
    private Customer customer;
    private LocalDate created;
    private LocalDate modified;
    private Product product;
    private String description;
    private double payment;
    public double getPayment() {
        return payment;
    }
    public void setPayment(double payment) {
        this.payment = payment;
    }
    public Order(Integer id, Customer customer, Product product, String description) {
        super(id);
        this.customer = customer;
        this.created = LocalDate.now();
        this.modified = LocalDate.now();
        this.product = product;
        this.description = description;
    }
    public Customer getCustomer() {
        return customer;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public LocalDate getModified() {
        return modified;
    }
    public void setModified(LocalDate modified) {
        this.modified = modified;
    }
    public LocalDate getCreated() {
        return created;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return super.toString() + "; customer: " + customer.name + "; created: " + created + "; product: {" + product +
               "}; description: " + description + "\n";
    }
}
