package bo.custom.impl;

import bo.custom.BookBO;
import dao.DAOFactory;
import dao.custom.BookDAO;
import dto.BookDTO;
import entity.Book;

import java.sql.SQLException;
import java.util.List;

public class BookBOImpl implements BookBO {

    BookDAO bookDAO =(BookDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.BOOK);
    @Override
    public boolean saveBook(BookDTO dto) throws SQLException {
        return bookDAO.save(new Book(dto.getId(),dto.getName(),dto.getType()));
    }

    @Override
    public boolean updateBook(BookDTO dto) throws SQLException {
        return false;
    }

    @Override
    public boolean removeBook(String id) throws SQLException {
        return false;
    }

    @Override
    public BookDTO searchBook(String id) throws SQLException {
        return null;
    }

    @Override
    public List<BookDTO> getAllBook() throws SQLException {
        return null;
    }
}
