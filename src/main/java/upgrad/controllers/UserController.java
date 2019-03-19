package upgrad.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import upgrad.model.Post;
import upgrad.model.User;
import upgrad.service.PostService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private PostService postService;
    @RequestMapping(value = "/users/login", method = RequestMethod.GET)
    public String login(){
        System.out.println("Login page");
        return "users/login";
    }
    @RequestMapping(value = "/users/login", method=RequestMethod.POST)
    public String loginUser(User user) {
        System.out.println(user.getUsername());
        return "redirect:/posts";
    }
    @RequestMapping("users/registration")
    public String registration(){
        return "users/registration";
    }

    @RequestMapping(value = "users/logout",method = RequestMethod.POST)
    public String logout(Model model){

        List<Post> posts = postService.getAllPosts();
        model.addAttribute("posts",posts);
        return "index";
    }

}
