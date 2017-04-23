package asd.asd.asd.controler;

import asd.asd.asd.Entity.Product;
import asd.asd.asd.Entity.User;
import asd.asd.asd.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class MainControler {

    @Autowired
    ProductService productService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("user",new User("1","2","3","4"));
        return "index";
    }

    @GetMapping("admin")
    public String adminPage(){
        return "admin";

    }
}
