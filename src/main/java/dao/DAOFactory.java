package dao;

import dao.custom.impl.*;

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

    public SuperDAO getDAO(DAOTypes dtoTypes) {
        switch (dtoTypes) {
            case ADMIN:
                return new AdminDaoImpl();
            case BOOK:
                return new BookDAOImpl();
            case BORROW:
                return new BorrowDaoImpl();
            case BRANCH:
                return new BranchDaoImpl();
            case QUERY:
                return new QueryDaoImpl();
            case USER:
                return new UserDaoImpl();

        }
        return null;
    }
}
