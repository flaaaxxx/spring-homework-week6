package pl.flaaaxxx.springhomeworkweek6.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.flaaaxxx.springhomeworkweek6.service.MailService;
import pl.flaaaxxx.springhomeworkweek6.service.MovieService;

@Component
@Aspect
public class MailAspect {

    private MailService mailService;
    private MovieService movieService;

    @Autowired
    public MailAspect(MailService mailService, MovieService movieService) {
        this.mailService = mailService;
        this.movieService = movieService;
    }

    @After("@annotation(MailAnn)")
    private void sendMailAsp() {
        String title = movieService.getMoviesList().get(movieService.getMoviesList().size()-1).getTitle();
        mailService.sendEmail("flaaaxxx@wp.pl", "New movie!!!", "New movie - Title: " + title);
    }
}
