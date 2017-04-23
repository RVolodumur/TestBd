package asd.asd.asd.controler;

import asd.asd.asd.Entity.Category;

import asd.asd.asd.Entity.Product;
import asd.asd.asd.Service.CategoryService;
import asd.asd.asd.Service.ProductService;
import asd.asd.asd.editor.CategoryEditor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;


@Controller
public class ProductControler {
        @Autowired
        private ProductService productService;
        @Autowired
        private CategoryService categoryService;
        @Autowired
        private CategoryEditor categoryEditor;

    public CategoryEditor getCategoryEditor() {
        return categoryEditor;
    }

    public void setCategoryEditor(CategoryEditor categoryEditor) {
        this.categoryEditor = categoryEditor;
    }

    public ProductService getProductService() {
        return productService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public CategoryService getCategoryService() {
        return categoryService;
    }

    public void setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

        @RequestMapping(value = "saveProduct",method = RequestMethod.GET)
        public String saveProduct(Model model){
            model.addAttribute("categorys",categoryService.findAll());
            return "saveProduct";
        }
        @RequestMapping(value = "saveProduct",method = RequestMethod.POST)
        public String saveProduct(@RequestParam String productName, @RequestParam String description, @RequestParam MultipartFile foto, @RequestParam Category category) throws IOException {

//            String realPath = System.getProperty("user.home") + File.separator + "images\\";
            String realPath = "D:\\images\\";
            File file = new File(realPath,foto.getOriginalFilename());
            foto.transferTo(file);
            Product product = new Product();
            product.setProductName(productName);
            product.setDescription(description);
            product.setFotoUrl("\\foto\\"+foto.getOriginalFilename());
            product.setCategory(category);
            productService.save(product);
            System.out.println(realPath+foto.getOriginalFilename());

            return "redirect:/";

        }
        @InitBinder
        public void beander(WebDataBinder webDataBinder){
            webDataBinder.registerCustomEditor(Category.class,categoryEditor);
        }
    }

