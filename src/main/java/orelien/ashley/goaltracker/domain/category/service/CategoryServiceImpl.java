package orelien.ashley.goaltracker.domain.category.service;

import orelien.ashley.goaltracker.domain.category.exception.CategoryNotFoundException;
import orelien.ashley.goaltracker.domain.category.model.Category;
import orelien.ashley.goaltracker.domain.category.repo.CategoryRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService{
    private static Logger logger = LoggerFactory.getLogger(CategoryServiceImpl.class);
    private CategoryRepo categoryRepo;

    @Override
    public Category create(Category category) {
        return categoryRepo.save(category);
    }

    @Override
    public Category update(Category category) throws CategoryNotFoundException {

        return null;
    }

    @Override
    public Category findByName(String name) throws CategoryNotFoundException {
        return null;
    }

    @Override
    public Iterable<Category> findAll() {
        return null;
    }

    @Override
    public Category delete(Long id) throws CategoryNotFoundException {
        return null;
    }
}
