package bo;

import bo.custom.impl.AdminBoImpl;
import bo.custom.impl.BookBOImpl;

public class BOFactory {
    public static  BOFactory boFactory;

    public BOFactory() {

    }

    public static BOFactory getBoFactory(){
        return (boFactory ==null) ? boFactory=new BOFactory() : boFactory;
    }
    public enum BOTypes{
        ADMIN,BOOK,BORROW,BRANCH,USER,QUERY
    }

    public SuperBO getBO(BOTypes boTypes){
        switch (boTypes){
            case ADMIN:
                return new AdminBoImpl();
            case BOOK:
                return new BookBOImpl();
            case BORROW:
                return new BorrowBoImpl();
            case BRANCH:
                return new BranchBoImpl();
            case USER:
                return new UserBoImpl();
            case QUERY:
                return new QueryBoImpl();
        }
        return null;
    }
}
