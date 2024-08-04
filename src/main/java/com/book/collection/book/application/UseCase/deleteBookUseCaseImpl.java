package com.book.collection.book.application.UseCase;
import com.book.collection.book.domain.repository.outbound.bookRepository;
import com.book.collection.book.domain.repository.inbound.deleteBookUseCase;
public class deleteBookUseCaseImpl implements deleteBookUseCase {
    private final bookRepository bookRepository;

    public deleteBookUseCaseImpl(com.book.collection.book.domain.repository.outbound.bookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void deleteBook(int bookId) {
    bookRepository.findAndDeleteBookById(bookId);
    }
}
