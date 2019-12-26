package pl.flaaaxxx.springhomeworkweek6.service;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.flaaaxxx.springhomeworkweek6.model.Movie;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    private List<Movie> moviesList;

    public MovieService() {
        this.moviesList = new ArrayList<>();
        moviesList.add(new Movie("Terminator", 1984, "James Cameron"));
        moviesList.add(new Movie("Terminator 2: Dzień sądu", 1991, "James Cameron"));
        moviesList.add(new Movie("Terminator 3: Bunt maszyn", 2003, "James Cameron"));
    }

    public List<Movie> getMoviesList() {
        return moviesList;
    }

    public void setMoviesList(List<Movie> moviesList) {
        this.moviesList = moviesList;
    }
}
