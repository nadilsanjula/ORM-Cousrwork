package bo.custom;

import bo.SuperBO;
import dto.BookDTO;

import java.sql.SQLException;
import java.util.List;

public interface BookBO extends SuperBO {

    boolean saveBook(BookDTO dto) throws SQLException;
    boolean updateBook(BookDTO dto) throws SQLException;
    boolean removeBook(String id) throws SQLException;
    BookDTO searchBook(String id) throws SQLException;
    List<BookDTO> getAllBook() throws SQLException;

}
