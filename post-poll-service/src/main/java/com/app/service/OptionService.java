package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Repository.OptionRepository;

@Service
public class OptionService {

	@Autowired
	private OptionRepository optionRepo;
	
	public int voteForOption(int optionId) {
		return optionRepo.voteForOption(optionId);
		
	}

}
