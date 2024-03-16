package dao.custom;

import dao.CrudDAO;
import entity.Borrow;

public interface BorrowDao extends CrudDAO<Borrow> {
    String generateNextValue2()throws Exception ;
}
