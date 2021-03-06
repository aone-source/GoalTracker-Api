package orelien.ashley.goaltracker.domain.category.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@Data
@Table(name="category")
public class Category {
    @Id
    private Long id;
    private String name;
}
