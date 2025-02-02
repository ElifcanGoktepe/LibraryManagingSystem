package com.elifcan.librarymanagingsystem.dto.request;

import com.elifcan.librarymanagingsystem.utility.Genre;

public record DoRegisterRequestDto(
        String title,
        String author,
        Genre genre,
        Integer publishYear,
        Integer pages
) {
}
