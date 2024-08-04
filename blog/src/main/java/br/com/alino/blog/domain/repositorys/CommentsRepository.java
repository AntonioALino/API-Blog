package br.com.alino.blog.domain.repositorys;

import br.com.alino.blog.domain.entities.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CommentsRepository extends JpaRepository<Comments, UUID> {
}
