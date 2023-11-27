package com.library;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.time.LocalDate;

@Entity
@Table(name = "book_borrowing")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class BookBorrowing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name = "borrower_name", nullable = false)
    private String borrowerName;

    @Column(name = "borrowing_date", nullable = false)
    private int borrowingDate;

    @Column(name = "return_date", nullable = false)
    private int returnDate;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "book_id")
    private Book book;
}
