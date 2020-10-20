package linkedtables;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "entity")
public class LinkedTablesApplication {

    public static void main(String[] args) {
        SpringApplication.run(LinkedTablesApplication.class, args);
    }

}
