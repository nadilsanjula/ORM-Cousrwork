package bo.custom.impl;

import bo.custom.BookBO;
import dao.DAOFactory;
import dao.custom.BookDAO;
import dto.BookDto;
import entity.Book;

import java.util.ArrayList;
import java.util.List;

public class BookBoImpl implements BookBO {
    BookDAO bookDao = (BookDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.BOOK);
    @Override
    public String generateNextBookId() throws Exception {
        return bookDao.generateNextId();
    }

    @Override
    public List<BookDto> getAllBooks() throws Exception {
        return null;
    }

    @Override
    public boolean saveBook(BookDto bookDto) throws Exception {
        return false;
    }

    @Override
    public boolean deleteBook(BookDto bookDto) throws Exception {
        return false;
    }

    @Override
    public boolean updateBook(BookDto bookDto) throws Exception {
        return false;
    }

    @Override
    public BookDto searchBook(String id) throws Exception {
        return null;
    }
    /*@Override
    public List<BookDto> getAllBooks() throws Exception {
        List<Book> books = bookDao.getAll();

        List<BookDto> bookDto = new ArrayList<>();

        for(Book book:books){
            bookDto.add(new BookDto(
                    book.getId(),
                    book.getTitle(),
                    book.getAuthor(),
                    book.getGenre(),
                    book.getStatus(),
                    book.getBranch()
            ));
        }
        return bookDto;
    }

    @Override
    public boolean saveBook(BookDto bookDto) throws Exception {
        return bookDao.save(new Book(
                bookDto.getId(),
                bookDto.getTitle(),
                bookDto.getAuthor(),
                bookDto.getGenre(),
                bookDto.getStatus(),
                bookDto.getBranch()
        ));
    }
    @Override
    public boolean deleteBook(BookDto bookDto) throws Exception {
        return bookDao.delete(new Book(
                bookDto.getId(),
                bookDto.getTitle(),
                bookDto.getAuthor(),
                bookDto.getGenre(),
                bookDto.getStatus(),
                bookDto.getBranch()
        ));
    }
    @Override
    public boolean updateBook(BookDto bookDto) throws Exception {
        return bookDao.update(new Book(
                bookDto.getId(),
                bookDto.getTitle(),
                bookDto.getAuthor(),
                bookDto.getGenre(),
                bookDto.getStatus(),
                bookDto.getBranch()
        ));
    }
    @Override
    public BookDto searchBook(String id) throws Exception {
        Book book = bookDao.search(id);

        return new BookDto(
                book.getId(),
                book.getTitle(),
                book.getAuthor(),
                book.getGenre(),
                book.getStatus(),
                book.getBranch()
        );
    }*/
}
