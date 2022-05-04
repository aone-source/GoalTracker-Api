package orelien.ashley.goaltracker.domain.goal.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import orelien.ashley.goaltracker.domain.category.model.Category;
import orelien.ashley.goaltracker.domain.user.model.User;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@Data
@Table(name = "goal")
public class Goal {
    @Id
    private Long id;
    private String goalDate;
    private String description;
    private Double start;
    private Double finish;
    private Double progress;
    @ManyToOne
    private Category category;
    @JsonIgnore
    @ManyToOne
    private User user;


}
