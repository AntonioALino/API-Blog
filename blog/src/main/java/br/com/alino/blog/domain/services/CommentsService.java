package br.com.alino.blog.domain.services;

import br.com.alino.blog.domain.entities.Comments;
import br.com.alino.blog.domain.repositorys.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CommentsService {

    @Autowired
    private CommentsRepository repository;

    public Comments create(Comments comments){
        return repository.save(comments);
    }

    public List<Comments> getAll(){
        return repository.findAll();
    }

    public Optional<Comments> getById(UUID id){
        return repository.findById(id);
    }

    public Optional<Comments> updateJustTheContent(UUID id, String newContent){
        return Optional.of(repository.findById(id).map(comments -> {
            comments.setContent(newContent);
            return repository.save(comments);
        }).orElseThrow(() -> new RuntimeException("Comments with id " + id + " not found.")));
    }

    public void delete(UUID id){
        repository.deleteById(id);
    }

}
