package br.com.alino.blog.domain.services;

import br.com.alino.blog.domain.entities.Posts;
import br.com.alino.blog.domain.repositorys.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PostsServices {

    @Autowired
    private PostsRepository repository;

    public Posts create(Posts posts){
        return repository.save(posts);
    }

    public List<Posts> getAll(){
        return repository.findAll();
    }

    public Optional<Posts> getById(UUID id){
        return repository.findById(id);
    }

    //Update Posts using PATCH
    public Optional<Posts> updateJustTheContent(UUID id, String newContent){
        return Optional.ofNullable(repository.findById(id).map(posts -> {
            posts.setContent(newContent);
            return repository.save(posts);
        }).orElseThrow(() -> new RuntimeException("Post not found with the ID " + id)));

    }

    public void deleteById(UUID id){
        repository.deleteById(id);
    }

}
