package bo;

import bo.custom.impl.BookBOImpl;

public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory() {
    }

    public static BOFactory getBoFactory() {
        return boFactory == null ? boFactory = new BOFactory() : boFactory;}


    public enum BOTypes {
        BOOK
    }

    public SuperBO getBO(BOTypes boTypes) {
        switch (boTypes) {
            case BOOK:
                return new BookBOImpl();



            default:
                return null;
        }
    }
}
