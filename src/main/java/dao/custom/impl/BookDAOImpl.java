package dao.custom.impl;

import config.FactoryConfiguration;
import dao.custom.BookDAO;
import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.SQLException;
import java.util.List;

public class BookDAOImpl implements BookDAO {
    Session session= FactoryConfiguration.getInstance().getSession();
    Transaction transaction = session.beginTransaction();
    @Override
    public boolean save(Book dto) throws SQLException {
        try {
            session.save(dto);
            transaction.commit();
            session.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        return true;
    }

    @Override
    public boolean update(Book dto) throws SQLException {
        return false;
    }

    @Override
    public boolean remove(String id) throws SQLException {
        return false;
    }

    @Override
    public Book search(String id) throws SQLException {
        return null;
    }

    @Override
    public List<Book> getAll() throws SQLException {
        return null;
    }
}
