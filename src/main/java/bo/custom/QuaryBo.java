package bo.custom;

import bo.SuperBO;
import dto.TimeOutDto;
import dto.TransactionDto;

import java.util.List;

public interface QuaryBo extends SuperBO {
    List<TransactionDto> getTransactions(String user) throws Exception;

    List<TimeOutDto> setAllTimeOut()throws Exception;
}
