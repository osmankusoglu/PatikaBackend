package dao;

import dao.abstracts.ICustomerDao;
import entities.Customer;

public class CustomerHibernateDao implements ICustomerDao {

    @Override
    public boolean saveCustomer(Customer customer) {
        System.out.println("Hibernate DAO Katmanı çalıştı ");
        System.out.println("Customer veritabanına eklendi");
        return true;
    }

    @Override
    public Customer getById(int id) {
        System.out.println("Hibernate DAO Katmanı Çalıştı");
        System.out.println("Customer veritabanından çekildi");
        return new Customer();
    }
}
