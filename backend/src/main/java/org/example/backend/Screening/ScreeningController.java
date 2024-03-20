package org.example.backend.Screening;

import org.example.backend.Movie.Movie;
import org.example.backend.Movie.MovieRepository;
import org.example.backend.Movietheatre.MovieTheatre;
import org.example.backend.Movietheatre.MovieTheatreRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/screenings")
@CrossOrigin
public class ScreeningController {

    private final ScreeningRepository screeningRepository;
    private final MovieRepository movieRepository;
    private final MovieTheatreRepository movieTheatreRepository;

    public ScreeningController(ScreeningRepository screeningRepository, MovieRepository movieRepository, MovieTheatreRepository movieTheatreRepository) {
        this.screeningRepository = screeningRepository;
        this.movieRepository = movieRepository;
        this.movieTheatreRepository = movieTheatreRepository;
    }

    @GetMapping("")
    public List<Screening> getAllScreenings() {
        return screeningRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Screening> getScreeningById(@PathVariable Long id) {
        return screeningRepository.findById(id);
    }

    @PostMapping("")
    public ResponseEntity<String> createScreening(@RequestBody ScreeningRequest request) {
        Movie movie = movieRepository.findById(request.getMovieId()).orElse(null);
        MovieTheatre movieTheatre = movieTheatreRepository.findById(request.getMovieTheatreId()).orElse(null);

        if (movie == null || movieTheatre == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid movie or movie theatre ID");
        }

        Screening screening = new Screening();
        screening.setMovie(movie);
        screening.setMovieTheatre(movieTheatre);
        screening.setLength(request.getLength());

        screeningRepository.save(screening);

        return ResponseEntity.status(HttpStatus.CREATED).body("Screening created successfully");
    }
}
