package asd.asd.asd.Service.impl;

import asd.asd.asd.Dao.CategoryDao;
import asd.asd.asd.Entity.Category;
import asd.asd.asd.Entity.Product;
import asd.asd.asd.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.ws.soap.Addressing;
import java.util.List;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryDao dao;
    public void save(String title, String description) {
        if (!title.isEmpty()&&!description.isEmpty()){
            Category category = new Category();

            dao.save(category);
        }
    }

    public Category findOne(int id) {
        return dao.findOne(id);
    }

    public List<Category> findAll() {
        return dao.findAll();
    }

    public void delete(int id) {
        dao.delete(id);
    }

    public void save(Category category) {
        dao.save(category);
    }
}
