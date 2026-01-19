package com.juste.bookstore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * @author PAKOU Komi Juste
 * @since 1/19/26
 */

@Entity
@Table(name = "publishers")
@Data
public class Publisher {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String biography;
}
