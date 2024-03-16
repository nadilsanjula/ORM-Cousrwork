package bo.custom;

import bo.SuperBO;

public interface BorrowBo extends SuperBO {

    String generateNextOrderDetailId() throws Exception;

    String genarateNextBorrowId() throws Exception;
}
