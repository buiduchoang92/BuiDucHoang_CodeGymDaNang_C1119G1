package Service;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private static Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "NgocTrinh", "ngoctrinh@gmail.com", "QuangTri"));
        customers.put(2, new Customer(2, "NgocTrinh2", "ngoctrinh2@gmail.com", "QuangTri1"));
        customers.put(3, new Customer(3, "NgocTrinh3", "ngoctrinh3@gmail.com", "QuangTri2"));
        customers.put(4, new Customer(4, "NgocTrinh4", "ngoctrinh4@gmail.com", "QuangTri3"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }

    @Override
    public List<Customer> seach(String name) {
        List<Customer> customers = new ArrayList<>();
        for (Customer c:findAll()
             ) {
            if (c.getName().equalsIgnoreCase(name)){
                customers.add(c);
            }
        }
        return customers;
    }
}
