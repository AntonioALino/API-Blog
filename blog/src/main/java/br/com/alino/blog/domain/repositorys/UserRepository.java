package br.com.alino.blog.domain.repositorys;

import br.com.alino.blog.domain.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<Users, UUID> {
    Users findByUsername(String username);
}
