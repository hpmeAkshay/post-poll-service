package com.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.VoterService;

@RestController
@RequestMapping("/voter")
public class VotersController {

	@Autowired
	private VoterService voterService;
	
//	@PostMapping("/getVoters/{optionId}")
//	public ResponseEntity<?> getVoters(@PathVariable("optionId") int optionId){
//		return ResponseEntity.ok().body(voterService.getVoters(optionId));
//		
//	}
}
