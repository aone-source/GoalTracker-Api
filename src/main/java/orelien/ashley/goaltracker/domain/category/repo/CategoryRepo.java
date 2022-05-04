package orelien.ashley.goaltracker.domain.category.repo;

import orelien.ashley.goaltracker.domain.category.model.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepo extends CrudRepository<Category, Long> {
    Optional<Category> findByName (String name);
}
