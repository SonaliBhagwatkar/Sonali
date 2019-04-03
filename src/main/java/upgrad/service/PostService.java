package upgrad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upgrad.model.Post;
import upgrad.repository.PostRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public List<Post> getAllPosts(){
        List<Post> posts = new ArrayList<>();


        return repository.getAllPosts();
    }

    public Post getOnePost() {
        return repository.getLatestPost();
    }

    public void createPost(Post newPost){
        newPost.setDate(new Date());
        repository.createPost(newPost);
        System.out.println("New Post:" + newPost);
    }

    public Post getPost(Integer postId) {
        Post post = repository.getPost(postId);
        return post;
    }

    public void updatePost(Post post) {
        post.setDate(new Date());
        repository.updatePost(post);
    }

    public void deletePost(Integer postId){
        repository.deletePost(postId);
    }
}
