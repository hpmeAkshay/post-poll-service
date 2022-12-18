package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.DTO.PostDTO;
import com.app.Entity.Comment;
import com.app.Entity.Post;
import com.app.Repository.CommentRepository;
import com.app.Repository.PostRepository;

@Service
@Transactional
public class PostService {
	@Autowired
	private PostRepository postRepo;
	@Autowired
	private ModelMapper mapper;
	@Autowired
	private CommentRepository commentRepo;
	public Post createPost(PostDTO post) {
		Post transPost = mapper.map(post, Post.class);
		if (transPost != null) {
			return postRepo.save(transPost);
		}
		return null;
	}

	public int deletePost(int postId) {
		postRepo.deleteById(postId);
		return 1;
	}

	public List<Comment> showComments(int postId) {
		
		return commentRepo.findAllById(postId);
	}
}
