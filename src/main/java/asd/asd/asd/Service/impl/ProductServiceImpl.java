package asd.asd.asd.Service.impl;

import asd.asd.asd.Dao.ProductDao;

import asd.asd.asd.Entity.Category;
import asd.asd.asd.Entity.Product;

import asd.asd.asd.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao dao;
    public ProductDao getDao() {
        return dao;
    }

    public void setDao(ProductDao dao) {
        this.dao = dao;
    }


    public void save(String productName, String description, String fotoUrl, Category category) {
        if (!productName.isEmpty()&&!description.isEmpty()&&!fotoUrl.isEmpty()){
            Product product = new Product(productName,description,fotoUrl,category);

            dao.save(product);
        }
    }

    public Product findOne(int id) {
        return dao.findOne(id);
    }

    public List<Product> findAll() {
        return dao.findAll();
    }

    public void delete(int id) {
        dao.delete(id);
    }

    public void save(Product product) {
        dao.save(product);
    }
}
