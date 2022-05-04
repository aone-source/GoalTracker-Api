package orelien.ashley.goaltracker.domain.goal.repo;

import orelien.ashley.goaltracker.domain.goal.model.Goal;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

public interface GoalRepo extends CrudRepository<Goal, Long> {
    Optional<Goal> findById(Long id);
}
