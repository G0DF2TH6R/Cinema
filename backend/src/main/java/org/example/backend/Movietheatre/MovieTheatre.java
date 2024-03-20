package org.example.backend.Movietheatre;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.example.backend.Screening.Screening;

import java.util.Set;

@Entity(name = "movie_theatre")
public class MovieTheatre {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer seats;

    @OneToMany(mappedBy = "movieTheatre")
    @JsonManagedReference
    private Set<Screening> screenings;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }
}
