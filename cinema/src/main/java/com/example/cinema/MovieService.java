package com.example.cinema;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    Movie movie1 = new Movie(1,"Star Wars","SciFi");
    Movie movie2 = new Movie(2,"Rambo","Action");
    Movie movie3 = new Movie(3,"Terminator","SciFi");

    List<Movie> moviesList = List.of(movie1, movie2, movie3);

    public Movie get(int id) {
        return moviesList.get(moviesList.indexOf(new Movie(id)));
    }

    public void addMovie(String title, String category) {
        new Movie(moviesList.size() + 1,title,category);
    }

    public void deleteMovie(int id) {
        moviesList.remove(id);
    }

    public boolean isExist(int id) {
        if (moviesList.get(id).equals(null)) {
            return false;
        } else {
            return true;
        }
    }
}

