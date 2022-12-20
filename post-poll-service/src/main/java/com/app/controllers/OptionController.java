package com.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.OptionService;

@RestController
@RequestMapping("/option")
public class OptionController {
	
	@Autowired
	private OptionService optionService;
	
	@PostMapping("/vote/{optionId}")
	public ResponseEntity<?> voteForOption(@PathVariable("optioId") int optionId){
		return ResponseEntity.ok().body(optionService.voteForOption(optionId ));
		
	}
	
}
