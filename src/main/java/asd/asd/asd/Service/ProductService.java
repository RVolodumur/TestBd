package asd.asd.asd.Service;

import asd.asd.asd.Entity.Category;
import asd.asd.asd.Entity.Product;
import asd.asd.asd.Entity.User;

import java.util.List;


public interface ProductService {
    public void save(String productName, String description, String fotoUrl, Category category);
    public Product findOne(int id);
    public List<Product> findAll();
    public void delete(int id);
    public void save(Product product);
}
