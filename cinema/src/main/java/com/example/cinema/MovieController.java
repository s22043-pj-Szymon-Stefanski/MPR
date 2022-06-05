package com.example.cinema;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public ResponseEntity<List<Movie>> movies() {

        return new ResponseEntity(movieService.moviesList, HttpStatus.OK);
    }


    @GetMapping("/movies/{id}")
    public ResponseEntity<Movie> printMovie(@PathVariable int id) {
        return new ResponseEntity(movieService.get(id), HttpStatus.OK);
    }


    @PostMapping ("/movies/build")
    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie) {
        movieService.addMovie("Shrek","Family");
        return new ResponseEntity<Movie>(movie, HttpStatus.OK);
    }

    @DeleteMapping("/movies/delete/{id}")
    public ResponseEntity<Movie> deleteMovie(@PathVariable int id) {

         movieService.deleteMovie(id);

        if (movieService.isExist(id)) {
            return new ResponseEntity<Movie>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<Movie>(HttpStatus.OK);
        }
    }
}
