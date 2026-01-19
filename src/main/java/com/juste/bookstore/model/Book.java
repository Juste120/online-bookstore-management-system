package com.juste.bookstore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * @author PAKOU Komi Juste
 * @since 1/19/26
 */

@Entity
@Table(name = "books")
@Data
public class Book {
    @Id @GeneratedValue
    private Long id;
    private String title;
    private String isbn;
}
