package br.com.alino.blog.domain.services;

import br.com.alino.blog.domain.entities.Users;
import br.com.alino.blog.domain.repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServices {

    @Autowired
    private UserRepository repository;

    //Create new User
    public Users create(Users users){
        return repository.save(users);
    }

    //Delete an User
    public void delete(UUID id){
        repository.deleteById(id);
    }




}
