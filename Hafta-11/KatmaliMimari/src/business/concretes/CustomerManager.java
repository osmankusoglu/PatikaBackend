package business;

import business.abstracts.ICustomerService;
import dao.ICustomerDao;
import entities.Customer;

public class CustomerManager implements ICustomerService {
    private final ICustomerDao customerDao;

    public CustomerManager(ICustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public boolean save(Customer customer) {
        // Veritabanında bu customer mail adresi daha önce eklenmiş mi ?
        System.out.println("Business Katmanı Çalıştı");
        return this.customerDao.saveCustomer(customer);
    }
    public Customer getById(int id){
        return this.customerDao.getById(id);
    }
}
