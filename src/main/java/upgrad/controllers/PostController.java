package upgrad.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import upgrad.model.Post;
import upgrad.service.PostService;

import java.util.List;

@Controller
public class PostController {

    @Autowired
    private PostService postService;

    @RequestMapping("/posts")
    public String getUserPosts(Model model){
        List<Post> posts = postService.getOnePost();
        model.addAttribute("posts",posts);
        return "posts";
    }
}
