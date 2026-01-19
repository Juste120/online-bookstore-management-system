package com.juste.bookstore.model;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * @author PAKOU Komi Juste
 * @since 1/19/26
 */

@Document(collection = "reviews")
@Data
public class Review {

    @Id
    private String id;
    private  Long bookId;
    private String reviewerName;
    private String comment;
    private int rating;
}
