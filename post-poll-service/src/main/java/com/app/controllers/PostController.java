package com.app.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.DTO.PostDTO;
import com.app.service.PostService;

@RestController
@RequestMapping("/post")
@CrossOrigin("")
public class PostController {
	@Autowired
	private PostService postService;

	@PostMapping("/create")
	public ResponseEntity<?> createPost(@Valid @RequestBody PostDTO post){
		return ResponseEntity.status(HttpStatus.CREATED).body(postService.createPost(post));
	}
	
	@DeleteMapping("/delet/{postId}")
	public ResponseEntity<?> deletePost(@PathVariable("postId") int postId){
		return ResponseEntity.ok().body(postService.deletePost(postId));
	}
	
	@PostMapping("/comments/{postId}")
	public ResponseEntity<?> showComments(@PathVariable("postId") int postId){
		return ResponseEntity.ok().body(postService.showComments(postId));
	}
	
	
	
}
