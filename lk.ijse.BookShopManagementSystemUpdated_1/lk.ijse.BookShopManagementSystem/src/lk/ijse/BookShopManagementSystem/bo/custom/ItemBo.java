package lk.ijse.BookShopManagementSystem.bo.custom;

import javafx.collections.ObservableList;
import lk.ijse.BookShopManagementSystem.dto.OrderDetailDTO;
import lk.ijse.BookShopManagementSystem.entity.BookTable;
import lk.ijse.BookShopManagementSystem.entity.Item;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemBo {
    public  boolean updatesQty(ArrayList<OrderDetailDTO> ob) throws SQLException, ClassNotFoundException;

    public  boolean updatesQty(OrderDetailDTO ob) throws SQLException, ClassNotFoundException;

    public ObservableList<BookTable> getThisMonthSelectedAllItems(String type) throws SQLException, ClassNotFoundException;

    public  ObservableList<Item> getAllAvailableItems() throws SQLException, ClassNotFoundException;

}
