package lk.ijse.BookShopManagementSystem.bo.custom;

import javafx.collections.ObservableList;
import lk.ijse.BookShopManagementSystem.dto.CustomerDTO;
import lk.ijse.BookShopManagementSystem.entity.Customer;

import java.sql.SQLException;

public interface CustomerBo {
     boolean saveCustomer(CustomerDTO customer) throws SQLException, ClassNotFoundException;

     boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException;

     boolean updateCustomer(CustomerDTO customer) throws SQLException, ClassNotFoundException;

     Customer searchCustomer(String id) throws SQLException, ClassNotFoundException;

     ObservableList<Customer> getAll() throws SQLException, ClassNotFoundException;
}


