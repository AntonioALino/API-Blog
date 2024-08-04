package br.com.alino.blog.domain.repositorys;

import br.com.alino.blog.domain.entities.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PostsRepository extends JpaRepository<Posts, UUID> {
}
