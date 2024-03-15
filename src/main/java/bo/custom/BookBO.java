package bo.custom;

import bo.SuperBO;
import dto.BookDto;

import java.sql.SQLException;
import java.util.List;

public interface BookBO extends SuperBO {
    String generateNextBookId() throws Exception ;

    List<BookDto> getAllBooks() throws Exception ;

    boolean saveBook(BookDto bookDto) throws Exception ;

    boolean deleteBook(BookDto bookDto) throws Exception ;

    boolean updateBook(BookDto bookDto) throws Exception ;

    BookDto searchBook(String id) throws Exception;
}
