package pl.flaaaxxx.springhomeworkweek6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.flaaaxxx.springhomeworkweek6.aspect.MailAnn;
import pl.flaaaxxx.springhomeworkweek6.model.Movie;
import pl.flaaaxxx.springhomeworkweek6.service.MovieService;

@Controller
public class MovieController {

    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/show")
    public String showMovies(Model model) {
        model.addAttribute("moviesList", movieService.getMoviesList());
        return "movies";
    }

    @GetMapping("/add-movie")
    public String addMovie(Model model) {
        model.addAttribute("movie", new Movie());
        return "addMovie";
    }

    @PostMapping("/add")
    @MailAnn
    public String add(@ModelAttribute Movie movie) {
        movieService.getMoviesList().add(movie);
        return "redirect:/show";
    }

}
