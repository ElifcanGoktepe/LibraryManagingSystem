package com.elifcan.librarymanagingsystem.entity;

import com.elifcan.librarymanagingsystem.utility.Genre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// adding lombok annotation
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tblbook")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String title;
    String author;
    Genre genre;
    Integer publishYear;
    Integer pages;
}
