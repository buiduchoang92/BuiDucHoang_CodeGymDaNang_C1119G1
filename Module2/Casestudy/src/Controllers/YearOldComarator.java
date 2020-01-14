package Controllers;

import Models.Customer;

import java.util.Comparator;

public class YearOldComarator implements Comparator<Customer> {
    @Override
    public int compare(Customer customer, Customer t1) {
       if (customer.getYearold()==t1.getYearold())
            return 0;
       else if (customer.getYearold()>t1.getYearold())
           return 1;
        else
           return -1;

    }
}
