package dao.custom;

import dao.SuperDAO;

import java.util.List;

public interface QuaryDao extends SuperDAO {
    public List<Object[]> getTransaction(String user)throws Exception;

    public List<Object[]> getAllTimeOut()throws Exception;
}
