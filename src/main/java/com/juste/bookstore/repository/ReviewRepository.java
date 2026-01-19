package com.juste.bookstore.repository;

import com.juste.bookstore.model.Review;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author PAKOU Komi Juste
 * @since 1/19/26
 */
public interface ReviewRepository  extends MongoRepository<Review, String> {
}
