package com.juste.bookstore.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

/**
 * @author PAKOU Komi Juste
 * @since 1/19/26
 */

@Entity
@Table(name = "books")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter @Getter
public class Book {
    @Id @GeneratedValue
    private Long id;
    private String title;
    private String isbn;
    @ManyToMany
    private List<Author> authors;
    private Boolean published;
}
