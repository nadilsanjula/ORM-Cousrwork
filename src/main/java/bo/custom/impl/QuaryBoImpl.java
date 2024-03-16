package bo.custom.impl;

import bo.custom.QuaryBo;
import dao.DAOFactory;

import dao.custom.QuaryDao;
import dto.TimeOutDto;
import dto.TransactionDto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuaryBoImpl implements QuaryBo {
    QuaryDao queryDao = (QuaryDao) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.QUERY);

    public List<TransactionDto> getTransactions(String user) throws Exception{
        List<Object[]> objects= queryDao.getTransaction(user);

        ArrayList<TransactionDto> trans = new ArrayList<>();


        for(Object[] ob : objects){
            trans.add(new TransactionDto(
                    (String) ob[0],
                    (String) ob[1],
                    (String) ob[2],
                    (Date) ob[3],
                    (Date) ob[4],
                    (String) ob[5]
            ));
        }
        return trans;

    }

    public List<TimeOutDto> setAllTimeOut() throws Exception {
        List<Object[]> objects = queryDao.getAllTimeOut();

        ArrayList<TimeOutDto> trans = new ArrayList<>();


        for(Object[] ob : objects){
            trans.add(new TimeOutDto(
                    (String) ob[0],
                    (String) ob[1],
                    (String) ob[2],
                    (Date) ob[3],
                    (Date) ob[4]
            ));
        }
        return trans;

    }
}
