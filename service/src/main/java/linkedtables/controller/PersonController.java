package linkedtables.controller;

import entity.Movie;
import entity.Person;
import linkedtables.repository.MovieRepository;
import linkedtables.repository.PassportRepository;
import linkedtables.repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    private PersonRepository personRepository;
    private PassportRepository passportRepository;
    private MovieRepository movieRepository;

    public PersonController(PersonRepository personRepository, PassportRepository passportRepository, MovieRepository movieRepository) {
        this.personRepository = personRepository;
        this.passportRepository = passportRepository;
        this.movieRepository = movieRepository;
    }

    @GetMapping("/generate")
    public Person generate(){

        Person person = new Person();
        person.setName("Vlad");

        Movie titanic = new Movie();
        titanic.setTitle("Titanic");


        Movie inception = new Movie();
        inception.setTitle("Inception");
        movieRepository.save(titanic);
        movieRepository.save(inception);


        inception.setWatchers(List.of(person));
        titanic.setWatchers(List.of(person));
        person.setLibrary(List.of(inception, titanic));
        Person save = personRepository.save(person);


        return save;
    }


    @GetMapping("/person")
    public List<Person> getAll(){

        return personRepository.findAll();
    }


    @GetMapping("/person/passport/{passportId}")
    public Person getByPassportId(@PathVariable Long passportId){

        return personRepository.findByPassportId(passportId);
    }





}
