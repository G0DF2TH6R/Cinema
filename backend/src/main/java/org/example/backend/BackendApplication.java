package org.example.backend;


import org.example.backend.Movie.Genre;
import org.example.backend.Movie.Movie;
import org.example.backend.Movie.MovieRepository;
import org.example.backend.Movietheatre.MovieTheatre;
import org.example.backend.Movietheatre.MovieTheatreRepository;
import org.example.backend.Screening.Screening;
import org.example.backend.Screening.ScreeningRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(MovieRepository movieRepository, ScreeningRepository screeningRepository, MovieTheatreRepository movieTheatreRepository) {
        return args -> {
            Movie movie = new Movie();
            movie.setGenre(Genre.ACTION);
            movie.setName("Star wars");
            movie.setLength(110);
            movieRepository.save(movie);

            movie = new Movie();
            movie.setGenre(Genre.COMEDY);
            movie.setName("Funny laughs");
            movie.setLength(90);
            movieRepository.save(movie);

            movie = new Movie();
            movie.setGenre(Genre.ROMANCE);
            movie.setName("Long kisses");
            movie.setLength(150);
            movieRepository.save(movie);

            movie = new Movie();
            movie.setGenre(Genre.DRAMA);
            movie.setName("Murder mystery");
            movie.setLength(120);
            movieRepository.save(movie);


            MovieTheatre movieTheatre = new MovieTheatre();
            movieTheatre.setSeats(120);
            movieTheatre.setName("Theatre no. 1");

            Screening screening1 = new Screening();
            screening1.setMovie(movie);
            screening1.setMovieTheatre(movieTheatre);



            movieTheatreRepository.save(movieTheatre);
            screeningRepository.save(screening1);
        };
    }

}
