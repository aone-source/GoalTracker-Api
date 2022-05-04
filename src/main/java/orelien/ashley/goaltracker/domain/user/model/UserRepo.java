package orelien.ashley.goaltracker.domain.user.model;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepo extends CrudRepository<User, Long> {
    Optional<User> findById (Long id);
    Optional<User> findByName (String name);
    Optional<User> findByEmail (String email);
}
