package org.example.backend.Screening;

import jakarta.persistence.criteria.CriteriaBuilder;

public class ScreeningRequest {
    private Long movieId;
    private Long movieTheatreId;
    private Integer length;

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public Long getMovieTheatreId() {
        return movieTheatreId;
    }

    public void setMovieTheatreId(Long movieTheatreId) {
        this.movieTheatreId = movieTheatreId;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }
}
