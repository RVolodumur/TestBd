package asd.asd.asd.Service;

import asd.asd.asd.Entity.Category;
import asd.asd.asd.Entity.Product;

import java.util.List;

public interface CategoryService {
    public void save(String title, String description);
    public Category findOne(int id);
    public List<Category> findAll();
    public void delete(int id);
    public void save(Category category);
}
