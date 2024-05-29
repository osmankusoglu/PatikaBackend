package dao;

import dao.abstracts.ICustomerDao;
import entities.Customer;

public class CustomerJdbcDao implements ICustomerDao {

    public boolean saveCustomer(Customer customer) {
        System.out.println("JDBC DAO Katmanı çalıştı ");
        System.out.println("Customer veritabanına eklendi");
        return true;
    }

    public Customer getById(int id) {
        System.out.println("JDBC DAO Katmanı Çalıştı");
        System.out.println("Customer veritabanından çekildi");
        return new Customer();
    }
}

