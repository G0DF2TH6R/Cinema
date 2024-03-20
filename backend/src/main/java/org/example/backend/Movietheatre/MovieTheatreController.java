package org.example.backend.Movietheatre;

import org.example.backend.Screening.Screening;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/movietheatres")
@CrossOrigin
public class MovieTheatreController {
    private final MovieTheatreRepository movieTheatreRepository;

    public MovieTheatreController(MovieTheatreRepository movieTheatreRepository) {
        this.movieTheatreRepository = movieTheatreRepository;
    }

    @GetMapping("")
    public List<MovieTheatre> getAllMovieTheatres() {
        return movieTheatreRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<MovieTheatre> getMovieTheatreById(@PathVariable Long id) {
        return movieTheatreRepository.findById(id);
    }

    @PostMapping("")
    public void postMovieTheatre(@RequestBody MovieTheatre movieTheatre) {
        movieTheatreRepository.save(movieTheatre);
    }
}
