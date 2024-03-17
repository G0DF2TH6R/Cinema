package org.example.backend.Date;

import org.example.backend.Movie.Movie;

import java.time.LocalDate;
import java.util.List;

public record Date(
        Integer id,
        LocalDate date,
        List<Movie> movies
) {
}
