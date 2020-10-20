package linkedtables.controller;

import entity.Movie;
import linkedtables.repository.MovieRepository;
import linkedtables.repository.PassportRepository;
import linkedtables.repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    private PersonRepository personRepository;
    private PassportRepository passportRepository;
    private MovieRepository movieRepository;

    public MovieController(PersonRepository personRepository, PassportRepository passportRepository, MovieRepository movieRepository) {
        this.personRepository = personRepository;
        this.passportRepository = passportRepository;
        this.movieRepository = movieRepository;
    }

    @GetMapping("/movie")
    public List<Movie> getAll(){

        return movieRepository.findAll();
    }





}
