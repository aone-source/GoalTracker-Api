package orelien.ashley.goaltracker.domain.expense.repo;

import orelien.ashley.goaltracker.domain.expense.model.Expense;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ExpenseRepo extends CrudRepository<Expense, Long> {
    Optional<Expense> findById(Long id);
}
