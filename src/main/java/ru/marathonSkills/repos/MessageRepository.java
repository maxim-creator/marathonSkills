package ru.marathonSkills.repos;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ru.marathonSkills.Models.Runner;
import org.springframework.data.repository.CrudRepository;


public interface MessageRepository extends CrudRepository<Runner, Long> {
}
