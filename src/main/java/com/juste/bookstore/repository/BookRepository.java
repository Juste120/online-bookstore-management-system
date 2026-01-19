package com.juste.bookstore.repository;

import com.juste.bookstore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author PAKOU Komi Juste
 * @since 1/19/26
 */
public interface BookRepository extends JpaRepository<Book,Long> {
}
