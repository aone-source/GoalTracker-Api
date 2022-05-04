package orelien.ashley.goaltracker.domain.expense.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import orelien.ashley.goaltracker.domain.category.model.Category;
import orelien.ashley.goaltracker.domain.user.model.User;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@NoArgsConstructor
@Data
@Table(name="expense")
public class Expense {
    @Id
    private Long id;
    private Instant expenseDate;
    private String description;
    private String location;
    @ManyToOne
    private Category category;
    @JsonIgnore
    @ManyToOne
    private User user;

}
