package dao;

import dao.custom.impl.AdminDaoImpl;
import dao.custom.impl.BookDAOImpl;
import dao.custom.impl.UserDaoImpl;

public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory() {
    }

    public static DAOFactory getDaoFactory() {
        return daoFactory == null ? daoFactory = new DAOFactory() : daoFactory;
    }

    public enum DAOTypes{
        ADMIN,BOOK,BORROW,BRANCH,QUERY,USER
    }

    public SuperDAO getDAO(DAOTypes dtoTypes){
        switch (dtoTypes){
            case ADMIN: return new AdminDaoImpl();
            case BOOK: return new BookDaoImpl();
            case BORROW: return new BorrowDaoImpl();
            case BRANCH: return new BranchDaoImpl();
            case QUERY: return new QueryDaoImpl();
            case USER:return new UserDaoImpl();

        }
        return null;
}
