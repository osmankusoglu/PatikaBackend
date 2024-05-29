package business;

import entities.Customer;

public interface ICustomerService {
    boolean save(Customer customer);
    Customer getById(int id);
}
