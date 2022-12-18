package com.app.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.Entity.Comment;
@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer>{
	@Query("SELECT u FROM Comment u WHERE u.post=postId")
	public List<Comment> findAllById(@Param("postId") int postId);
}
