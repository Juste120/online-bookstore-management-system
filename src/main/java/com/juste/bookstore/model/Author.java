package com.juste.bookstore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;
import jakarta.persistence.Id;

/**
 * @author PAKOU Komi Juste
 * @since 1/19/26
 */
@Entity
@Table(name = "authors")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String address;
    private String biography;
    @ManyToOne
    private Publisher publisher;
}
