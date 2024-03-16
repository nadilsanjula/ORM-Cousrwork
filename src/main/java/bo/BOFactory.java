package bo;

import bo.custom.impl.*;

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
                return new BookBoImpl();
            case BORROW:
                return new BorrowBoImpl();
            case BRANCH:
                return new BranchBoImpl();
            case USER:
                return new UserBoImpl();
            case QUERY:
                return new QuaryBoImpl();
        }
        return null;
    }
}
