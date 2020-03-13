package Controllers;

import Models.Customer;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customer> {

    @Override
    public int compare(Customer customer, Customer customer1) {
        if (customer.getCustomerName().compareTo(customer1.getCustomerName() )== 0) {
            return new YearOldComarator().compare(customer,customer1);
        } else {
            return customer.getCustomerName().compareTo(customer1.getCustomerName());
        }
    }
}
