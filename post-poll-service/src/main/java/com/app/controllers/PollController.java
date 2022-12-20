package com.app.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.DTO.PollDTO;
import com.app.Entity.Poll;
import com.app.service.PollService;

@RestController
@RequestMapping("/poll")
public class PollController {

	@Autowired
	private PollService pollService;

	@PostMapping("/create")
	public ResponseEntity<?> createPoll(@Valid @RequestBody PollDTO poll) {
		return ResponseEntity.status(HttpStatus.CREATED).body(pollService.createPoll(poll));
	}
	
	@PostMapping("/delet/{pollId}")
	public ResponseEntity<?> deletePoll(@PathVariable("pollId") int pollId){
		return ResponseEntity.ok().body(pollService.deletePoll(pollId));
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<?> getAllPolls(){
		return ResponseEntity.ok().body(pollService.getAllPolls());
	}

	
}
