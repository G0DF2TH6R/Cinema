package org.example.backend.Movie;


import java.util.Date;
import java.util.List;

public record Movie(
        Integer id,
        String title,
        String desc,
        List<Genre> genres,
        List<Date> dates,
        Integer lengthMinutes

) {
}
