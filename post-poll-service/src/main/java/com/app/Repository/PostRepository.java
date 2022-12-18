package com.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.Entity.Post;
@Repository
public interface PostRepository extends JpaRepository<Post, Integer>{

}
