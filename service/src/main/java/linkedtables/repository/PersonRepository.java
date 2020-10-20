package linkedtables.repository;

import entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

    Person findByPassportId(Long passportId);

}
