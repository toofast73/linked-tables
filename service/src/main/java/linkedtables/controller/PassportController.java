package linkedtables.controller;

import entity.Passport;
import linkedtables.repository.PassportRepository;
import linkedtables.repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PassportController {

    private PersonRepository personRepository;
    private PassportRepository passportRepository;

    public PassportController(PersonRepository personRepository, PassportRepository passportRepository) {
        this.personRepository = personRepository;
        this.passportRepository = passportRepository;
    }


    @GetMapping("/passport")
    public List<Passport> getAll(){

        return passportRepository.findAll();
    }





}
