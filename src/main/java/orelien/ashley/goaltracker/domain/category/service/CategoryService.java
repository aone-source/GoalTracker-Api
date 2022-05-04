package orelien.ashley.goaltracker.domain.category.service;

import orelien.ashley.goaltracker.domain.category.exception.CategoryNotFoundException;
import orelien.ashley.goaltracker.domain.category.model.Category;

public interface CategoryService {
    Category create (Category category);
    Category update (Category category) throws CategoryNotFoundException;
    Category findByName (String name) throws CategoryNotFoundException;
    Iterable<Category> findAll();
    Category delete (Long id) throws CategoryNotFoundException;

}
