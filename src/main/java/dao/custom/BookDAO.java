package dao.custom;

import dao.CrudDAO;
import entity.Book;

import java.util.List;

public interface BookDAO extends CrudDAO<Book> {
    public String generateNextId()throws Exception;

    public List<Book> getAll()throws Exception;

    public boolean save(Book book)throws Exception;

    public boolean delete(Book book)throws Exception;

    public boolean update(Book book)throws Exception;

    public Book search(String id)throws Exception;
}
