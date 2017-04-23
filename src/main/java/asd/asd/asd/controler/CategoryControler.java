package asd.asd.asd.controler;

import asd.asd.asd.Entity.Category;
import asd.asd.asd.Entity.User;
import asd.asd.asd.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.misc.Contended;

import java.util.List;

@Controller
public class CategoryControler {
    @Autowired
    private CategoryService categoryService;

    public CategoryService getCategoryService() {
        return categoryService;
    }

    public void setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @RequestMapping(value = "saveCategory", method = RequestMethod.GET)
    public String createCategory(Model model){
        model.addAttribute("category", new Category());
        return "saveCategory";
    }
    @RequestMapping(value = "saveCategory",method = RequestMethod.POST)
    public String createCategory(@ModelAttribute ("category") Category category) {
        categoryService.save(category);
        return "saveCategory";
    }
    @RequestMapping(value = "AllCategories", method = RequestMethod.GET)
    public String showAllCategories(Model model){
        List<Category> categories = categoryService.findAll();
        model.addAttribute("categories",categories);
        return "AllCategories";
    }
}
