package com.juste.bookstore.repository;

import com.juste.bookstore.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author PAKOU Komi Juste
 * @since 1/19/26
 */
public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
