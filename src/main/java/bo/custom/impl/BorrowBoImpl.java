package bo.custom.impl;

import bo.custom.BorrowBo;
import dao.DAOFactory;
import dao.custom.BorrowDao;

public class BorrowBoImpl implements BorrowBo {


    BorrowDao borrowDaO = (BorrowDao) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.BORROW);
    @Override
    public String generateNextOrderDetailId() throws Exception {
        return borrowDaO.generateNextValue2();
    }
    @Override
    public String genarateNextBorrowId() throws Exception {
        return borrowDaO.generateNextId();
    }
}
