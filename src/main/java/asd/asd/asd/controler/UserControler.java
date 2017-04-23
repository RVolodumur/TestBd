package asd.asd.asd.controler;

import asd.asd.asd.Entity.User;
import asd.asd.asd.Service.MailService;
import asd.asd.asd.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserControler {
    @Autowired
    private UserService userService;

    @Autowired
    private MailService mailService;

    @RequestMapping(value = "saveUser",method = RequestMethod.POST)
    public String saveUser(@ModelAttribute ("user") User user){

        mailService.send(user);
        userService.save(user);
        return "redirect:/";
    }

//    @RequestMapping(value = "login",method = RequestMethod.GET)
//    public String toLoginPage(){
//        return "logIn";
//    }

    @RequestMapping(value ="login",method = RequestMethod.POST)
    public String logIn(@RequestParam String userName,@RequestParam String password, HttpSession httpSession){
        User user = userService.findOne(userName);
        if (user.getPassword()== password){
            httpSession.setAttribute("user",user);
        }
        else {
            System.out.println("error password");
        }
        return "redirect:/";
    }
}
