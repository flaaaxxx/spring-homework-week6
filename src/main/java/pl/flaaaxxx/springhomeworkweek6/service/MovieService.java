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
        moviesList.add(new Movie("Terminator 1", 1989, "Producent 1"));
        moviesList.add(new Movie("Terminator 2", 1990, "Producent 2"));
        moviesList.add(new Movie("Terminator 3", 2003, "Producent 3"));
    }

    public List<Movie> getMoviesList() {
        return moviesList;
    }

    public void setMoviesList(List<Movie> moviesList) {
        this.moviesList = moviesList;
    }
}
